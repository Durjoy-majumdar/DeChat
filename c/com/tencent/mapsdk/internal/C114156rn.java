package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.tools.json.JsonUtils;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mapsdk.internal.rn */
public final class C114156rn {

    /* renamed from: a */
    private static final TreeMap<String, Class<? extends CommandFunctionModelClass.BaseCommandFunction>> f341707a = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: b */
    private static final AtomicInteger f341708b = new AtomicInteger(0);

    private C114156rn() {
    }

    /* renamed from: a */
    public static void m159359a() {
        if (f341708b.getAndIncrement() == 0) {
            TreeMap<String, Class<? extends CommandFunctionModelClass.BaseCommandFunction>> treeMap = f341707a;
            treeMap.put("setPosition", CommandFunctionModelClass.SetPositionCommand.class);
            treeMap.put("getPosition", CommandFunctionModelClass.GetPositionCommand.class);
            treeMap.put("enableClick", CommandFunctionModelClass.EnableClickCommand.class);
            treeMap.put("getClickEnabled", CommandFunctionModelClass.GetClickEnabledCommand.class);
            treeMap.put("setVisible", CommandFunctionModelClass.SetVisibleCommand.class);
            treeMap.put("getVisible", CommandFunctionModelClass.GetVisibleCommand.class);
            treeMap.put("playSkeletonAnimation", CommandFunctionModelClass.PlaySkeletonAnimationCommand.class);
            treeMap.put("stopSkeletonAnimation", CommandFunctionModelClass.StopSkeletonAnimationCommand.class);
            treeMap.put("getSkeletonAnimationInfo", CommandFunctionModelClass.GetSkeletonAnimationInfoCommand.class);
            treeMap.put("startTranslateAnimation", CommandFunctionModelClass.StartTranslateAnimationCommand.class);
            treeMap.put("getType", CommandFunctionModelClass.GetTypeCommand.class);
            treeMap.put("setScale", CommandFunctionModelClass.SetScaleCommand.class);
            treeMap.put("getScale", CommandFunctionModelClass.GetScaleCommand.class);
            treeMap.put("setRotation", CommandFunctionModelClass.SetRotationCommand.class);
            treeMap.put("getRotation", CommandFunctionModelClass.GetRotationCommand.class);
            treeMap.put("setPixelBound", CommandFunctionModelClass.SetPixelBoundCommand.class);
            treeMap.put("setExposure", CommandFunctionModelClass.SetExposureCommand.class);
            treeMap.put("getExposure", CommandFunctionModelClass.GetExposureCommand.class);
            treeMap.put("setZoomLevelRange", CommandFunctionModelClass.SetZoomLevelRangeCommand.class);
            treeMap.put("getMaterialVariantsInfo", CommandFunctionModelClass.GetMaterialVariantsCommand.class);
            treeMap.put("getCurrentMaterialVariant", CommandFunctionModelClass.GetCurrentMaterialVariantCommand.class);
            treeMap.put("setMaterialVariant", CommandFunctionModelClass.SetMaterialVariantCommand.class);
            treeMap.put("setMonoColor", CommandFunctionModelClass.SetMonoColorCommand.class);
            treeMap.put("resetMonoColor", CommandFunctionModelClass.ResetColorCommand.class);
        }
    }

    /* renamed from: b */
    public static void m159360b() {
        if (f341708b.decrementAndGet() == 0) {
            f341707a.clear();
        }
    }

    /* renamed from: c */
    private static void m159361c() {
        TreeMap<String, Class<? extends CommandFunctionModelClass.BaseCommandFunction>> treeMap = f341707a;
        treeMap.put("setPosition", CommandFunctionModelClass.SetPositionCommand.class);
        treeMap.put("getPosition", CommandFunctionModelClass.GetPositionCommand.class);
        treeMap.put("enableClick", CommandFunctionModelClass.EnableClickCommand.class);
        treeMap.put("getClickEnabled", CommandFunctionModelClass.GetClickEnabledCommand.class);
        treeMap.put("setVisible", CommandFunctionModelClass.SetVisibleCommand.class);
        treeMap.put("getVisible", CommandFunctionModelClass.GetVisibleCommand.class);
        treeMap.put("playSkeletonAnimation", CommandFunctionModelClass.PlaySkeletonAnimationCommand.class);
        treeMap.put("stopSkeletonAnimation", CommandFunctionModelClass.StopSkeletonAnimationCommand.class);
        treeMap.put("getSkeletonAnimationInfo", CommandFunctionModelClass.GetSkeletonAnimationInfoCommand.class);
        treeMap.put("startTranslateAnimation", CommandFunctionModelClass.StartTranslateAnimationCommand.class);
        treeMap.put("getType", CommandFunctionModelClass.GetTypeCommand.class);
        treeMap.put("setScale", CommandFunctionModelClass.SetScaleCommand.class);
        treeMap.put("getScale", CommandFunctionModelClass.GetScaleCommand.class);
        treeMap.put("setRotation", CommandFunctionModelClass.SetRotationCommand.class);
        treeMap.put("getRotation", CommandFunctionModelClass.GetRotationCommand.class);
        treeMap.put("setPixelBound", CommandFunctionModelClass.SetPixelBoundCommand.class);
        treeMap.put("setExposure", CommandFunctionModelClass.SetExposureCommand.class);
        treeMap.put("getExposure", CommandFunctionModelClass.GetExposureCommand.class);
        treeMap.put("setZoomLevelRange", CommandFunctionModelClass.SetZoomLevelRangeCommand.class);
        treeMap.put("getMaterialVariantsInfo", CommandFunctionModelClass.GetMaterialVariantsCommand.class);
        treeMap.put("getCurrentMaterialVariant", CommandFunctionModelClass.GetCurrentMaterialVariantCommand.class);
        treeMap.put("setMaterialVariant", CommandFunctionModelClass.SetMaterialVariantCommand.class);
        treeMap.put("setMonoColor", CommandFunctionModelClass.SetMonoColorCommand.class);
        treeMap.put("resetMonoColor", CommandFunctionModelClass.ResetColorCommand.class);
    }

    /* renamed from: d */
    private static void m159362d() {
        f341707a.clear();
    }

    /* renamed from: a */
    public static CommandFunctionModelClass.BaseCommandFunction m159356a(String str) {
        return (CommandFunctionModelClass.BaseCommandFunction) JsonUtils.parseToModel(str, CommandFunctionModelClass.BaseCommandFunction.class, new Object[0]);
    }

    /* renamed from: a */
    public static CommandFunctionModelClass.BaseCommandFunction m159357a(String str, String str2) {
        String trim = str2.trim();
        TreeMap<String, Class<? extends CommandFunctionModelClass.BaseCommandFunction>> treeMap = f341707a;
        if (treeMap.containsKey(trim)) {
            return (CommandFunctionModelClass.BaseCommandFunction) JsonUtils.parseToModel(str, treeMap.get(trim), new Object[0]);
        }
        return new CommandFunctionModelClass.ErrorCommandFunction();
    }

    /* renamed from: a */
    public static String m159358a(ReturnInfoModelClass.ReturnStatus returnStatus) {
        return JsonUtils.modelToJsonString(returnStatus);
    }
}
