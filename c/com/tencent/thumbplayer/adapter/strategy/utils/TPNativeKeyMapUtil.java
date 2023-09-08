package com.tencent.thumbplayer.adapter.strategy.utils;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.tplayer.TPOptionalIDInternal;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class TPNativeKeyMapUtil {
    private static final String REVERSE_MAP_NAME_SUFFIX = ".reverseMap";
    private static final String TAG = "TPNativeKeyMapUtil";
    private static final AtomicBoolean sHasOptionalIdMapInit = new AtomicBoolean(false);
    private static final Map<Class<?>, AtomicBoolean> sHasThisAnnotationInitMap = new ConcurrentHashMap();
    private static final Map<String, Map<Number, Number>> sNameToMap = new ConcurrentHashMap();
    private static final SparseArray<String> sOptionalIdKeyToNameMap = new SparseArray<>();
    private static final SparseArray<TPThumbPlayerUtils.OptionIdMapping> sToNativeOptionalIdMap = new SparseArray<>();

    private static <T extends Annotation> void buildBiDirectionMapForAnnotation(Class<T> cls) {
        AtomicBoolean atomicBoolean;
        TPLogUtil.m21897i(TAG, "buildBiDirectionMapForAnnotation, clazz=" + cls);
        Map<Class<?>, AtomicBoolean> map = sHasThisAnnotationInitMap;
        synchronized (map) {
            atomicBoolean = map.get(cls);
            if (atomicBoolean == null) {
                atomicBoolean = new AtomicBoolean(false);
                map.put(cls, atomicBoolean);
            }
        }
        synchronized (atomicBoolean) {
            if (atomicBoolean.get()) {
                TPLogUtil.m21897i(TAG, "className=" + cls.getSimpleName() + " already init");
                return;
            }
            searchClassToFillMap(cls);
            atomicBoolean.set(true);
        }
    }

    private static void buildNativeInitConfigMap() {
        try {
            Class<?> cls = Class.forName(TPOptionalID.class.getName());
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int")) {
                    TPNativeKeyMap.MapInitConfig mapInitConfig = (TPNativeKeyMap.MapInitConfig) field.getAnnotation(TPNativeKeyMap.MapInitConfig.class);
                    if (mapInitConfig != null) {
                        int i = field.getInt(cls);
                        sOptionalIdKeyToNameMap.put(i, mapInitConfig.keyName());
                        if (mapInitConfig.value() == -1) {
                            sToNativeOptionalIdMap.put(i, new TPThumbPlayerUtils.OptionIdMapping());
                        } else {
                            field.setAccessible(true);
                            sToNativeOptionalIdMap.put(i, new TPThumbPlayerUtils.OptionIdMapping(mapInitConfig.type(), mapInitConfig.value()));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        } catch (IllegalAccessException e2) {
            TPLogUtil.m21895e(TAG, (Throwable) e2);
        }
    }

    private static void buildNativeOptionalIdToMapInternal(Class<?> cls) {
        try {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int")) {
                    TPNativeKeyMap.MapOptionalId mapOptionalId = (TPNativeKeyMap.MapOptionalId) field.getAnnotation(TPNativeKeyMap.MapOptionalId.class);
                    if (mapOptionalId != null) {
                        int i = field.getInt(cls);
                        sOptionalIdKeyToNameMap.put(i, mapOptionalId.keyName());
                        if (mapOptionalId.value() == -1) {
                            sToNativeOptionalIdMap.put(i, new TPThumbPlayerUtils.OptionIdMapping());
                        } else {
                            field.setAccessible(true);
                            sToNativeOptionalIdMap.put(i, new TPThumbPlayerUtils.OptionIdMapping(mapOptionalId.type(), mapOptionalId.value()));
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    private static void buildOptionalIdMap() {
        AtomicBoolean atomicBoolean = sHasOptionalIdMapInit;
        synchronized (atomicBoolean) {
            if (sToNativeOptionalIdMap.size() == 0) {
                if (!atomicBoolean.get()) {
                    buildNativeInitConfigMap();
                    buildPublicToNativeOptionalIdMap();
                    buildPrivateToNativeOptionalIdMap();
                    atomicBoolean.set(true);
                    return;
                }
                throw new IllegalStateException("构建Map错误，请查看【--keep class com.tencent.thumbplayer.api.** { *; }】是否加入反混淆");
            }
        }
    }

    private static void buildPrivateToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(Class.forName(TPOptionalIDInternal.class.getName()));
        } catch (ClassNotFoundException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    private static void buildPublicToNativeOptionalIdMap() {
        try {
            buildNativeOptionalIdToMapInternal(Class.forName(TPOptionalID.class.getName()));
        } catch (ClassNotFoundException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    private static <T extends Annotation> void checkFillMapValidity(Class<T> cls, Map<Number, Number> map, Map<Number, Number> map2, Class<?> cls2, Number number, Number number2) {
        if (map.containsKey(number2)) {
            throw new IllegalStateException(cls2.getName() + " 配置了重复的成员变量，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下使用这个注解@" + cls.getName() + "的哪两个成员变量值相等");
        } else if (map2.containsKey(number)) {
            throw new IllegalStateException(cls2.getName() + " 配置了重复的注解值，注解=" + cls.getName() + " 成员变量值=" + number2 + " 请查找一下@" + cls.getName() + "(这个值)在哪里重复了");
        }
    }

    public static TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId(@TPCommonEnum.TPOptionalId int i) {
        SparseArray<TPThumbPlayerUtils.OptionIdMapping> sparseArray = sToNativeOptionalIdMap;
        if (sparseArray.size() == 0) {
            buildOptionalIdMap();
        }
        return sparseArray.get(i, new TPThumbPlayerUtils.OptionIdMapping());
    }

    @TPCommonEnum.NativeSurfaceType
    public static int convertToNativeSurfaceType(@TPCommonEnum.TPSurfaceType int i) {
        try {
            Class<?> cls = Class.forName(ITPPlayer.class.getName());
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().toString().equals("int")) {
                    field.setAccessible(true);
                    if (i == field.getInt(cls)) {
                        TPNativeKeyMap.MapSurfaceType mapSurfaceType = (TPNativeKeyMap.MapSurfaceType) field.getAnnotation(TPNativeKeyMap.MapSurfaceType.class);
                        if (mapSurfaceType != null) {
                            return mapSurfaceType.value();
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        } catch (IllegalAccessException e2) {
            TPLogUtil.m21895e(TAG, (Throwable) e2);
        }
        TPLogUtil.m21899w(TAG, "convertToNativeSurfaceType, player surface type is invalid(" + i + "), return unspecified instead");
        return 0;
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToNativeMap(Class<T> cls) {
        return new HashSet(getMapForAnnotation(cls, true).entrySet());
    }

    public static <T extends Annotation> Set<Map.Entry<Number, Number>> getEntrySetOfToTPMap(Class<T> cls) {
        return new HashSet(getMapForAnnotation(cls, false).entrySet());
    }

    private static <T extends Annotation> Map<Number, Number> getMapForAnnotation(Class<T> cls, boolean z) {
        String mapKey = getMapKey(cls, z);
        Map<String, Map<Number, Number>> map = sNameToMap;
        Map<Number, Number> map2 = map.get(mapKey);
        if (map2 == null || map2.size() == 0) {
            buildBiDirectionMapForAnnotation(cls);
            map2 = map.get(mapKey);
        }
        if (((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)) == null) {
            throw new IllegalArgumentException(cls.getSimpleName() + "has not SearchConfig annotation");
        } else if (map2 != null && map2.size() != 0) {
            return map2;
        } else {
            throw new IllegalStateException(cls.getSimpleName() + " is null after buildBiDirectionMap");
        }
    }

    private static <T extends Annotation> String getMapKey(Class<T> cls, boolean z) {
        String canonicalName = cls.getCanonicalName();
        if (z) {
            return canonicalName;
        }
        return canonicalName + REVERSE_MAP_NAME_SUFFIX;
    }

    public static String getOptionalIdName(int i) {
        if (!sHasOptionalIdMapInit.get()) {
            buildOptionalIdMap();
        }
        return sOptionalIdKeyToNameMap.get(i, "");
    }

    public static void init() {
        long currentTimeMillis = System.currentTimeMillis();
        Class[] declaredClasses = TPNativeKeyMap.class.getDeclaredClasses();
        TPLogUtil.m21897i(TAG, "init BiDirectionMap for tp&native value");
        for (Class cls : declaredClasses) {
            if (cls.isAnnotation() && Modifier.isPublic(cls.getModifiers()) && ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)) != null) {
                buildBiDirectionMapForAnnotation(cls);
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        TPLogUtil.m21897i(TAG, "init cost time=" + (currentTimeMillis2 - currentTimeMillis));
    }

    private static <T extends Annotation> void searchClassToFillMap(Class<T> cls) {
        int i;
        Number number;
        Integer num;
        Class<T> cls2 = cls;
        boolean z = true;
        String mapKey = getMapKey(cls2, true);
        Map<String, Map<Number, Number>> map = sNameToMap;
        Map map2 = map.get(mapKey);
        String mapKey2 = getMapKey(cls2, false);
        Map map3 = map.get(mapKey2);
        if (map2 == null || map3 == null) {
            map2 = new HashMap();
            map.put(mapKey, map2);
            map3 = new HashMap();
            map.put(mapKey2, map3);
        }
        Map map4 = map2;
        Map map5 = map3;
        try {
            TPNativeKeyMap.SearchConfig searchConfig = (TPNativeKeyMap.SearchConfig) cls2.getAnnotation(TPNativeKeyMap.SearchConfig.class);
            if (searchConfig != null) {
                Class<?> searchClass = searchConfig.searchClass();
                Field[] declaredFields = searchClass.getDeclaredFields();
                int length = declaredFields.length;
                int i2 = 0;
                while (i2 < length) {
                    Field field = declaredFields[i2];
                    String str = "";
                    Class<? extends Number> valueClass = searchConfig.valueClass();
                    Class<? extends Number> cls3 = Integer.TYPE;
                    if (valueClass == cls3) {
                        str = "int";
                    } else if (searchConfig.valueClass() == Long.TYPE) {
                        str = "long";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (field.getType().toString().equals(str)) {
                            T annotation = field.getAnnotation(cls2);
                            if (annotation != null) {
                                field.setAccessible(z);
                                int i3 = i2;
                                Method declaredMethod = cls2.getDeclaredMethod("value", new Class[0]);
                                z = true;
                                declaredMethod.setAccessible(true);
                                if (searchConfig.valueClass() == cls3) {
                                    number = Integer.valueOf(field.getInt(searchClass));
                                    num = (Integer) declaredMethod.invoke(annotation, new Object[0]);
                                } else if (searchConfig.valueClass() == Long.TYPE) {
                                    number = Long.valueOf(field.getLong(searchClass));
                                    num = (Long) declaredMethod.invoke(annotation, new Object[0]);
                                } else {
                                    throw new IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                                }
                                Number number2 = num;
                                i = i3;
                                checkFillMapValidity(cls, map4, map5, searchClass, number2, number);
                                Number number3 = number2;
                                map4.put(number, number3);
                                map5.put(number3, number);
                                i2 = i + 1;
                            }
                        }
                        i = i2;
                        i2 = i + 1;
                    } else {
                        throw new IllegalArgumentException("代码还没实现对" + searchConfig.valueClass().getName() + "的支持");
                    }
                }
                return;
            }
            throw new IllegalArgumentException(cls.getCanonicalName() + "has not SearchConfig annotation");
        } catch (IllegalAccessException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        } catch (NoSuchMethodException e2) {
            TPLogUtil.m21895e(TAG, (Throwable) e2);
            throw new IllegalStateException("com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap下所有元素需要加到混淆中, 并且每个MapXXX注解需要有value方法");
        } catch (InvocationTargetException e3) {
            TPLogUtil.m21895e(TAG, (Throwable) e3);
        }
    }

    public static <T extends Annotation> int toNativeIntValue(Class<T> cls, int i) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(Integer.valueOf(i))) {
            return mapForAnnotation.get(Integer.valueOf(i)).intValue();
        }
        TPLogUtil.m21894e(TAG, "toNativeValue, tpValue=" + i + "return default value, clazz" + cls);
        return (int) ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends Annotation> long toNativeLongValue(Class<T> cls, long j) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, true);
        if (mapForAnnotation.containsKey(Long.valueOf(j))) {
            return mapForAnnotation.get(Long.valueOf(j)).longValue();
        }
        TPLogUtil.m21894e(TAG, "toNativeValue, tpValue=" + j + "return default value, clazz" + cls);
        return ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).nativeDefValue();
    }

    public static <T extends Annotation> int toTPIntValue(Class<T> cls, int i) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(Integer.valueOf(i))) {
            return mapForAnnotation.get(Integer.valueOf(i)).intValue();
        }
        TPLogUtil.m21897i(TAG, "toTPValue, nativeValue=" + i + "return default value, clazz" + cls);
        return (int) ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }

    public static <T extends Annotation> long toTPLongValue(Class<T> cls, long j) {
        Map<Number, Number> mapForAnnotation = getMapForAnnotation(cls, false);
        if (mapForAnnotation.containsKey(Long.valueOf(j))) {
            return mapForAnnotation.get(Long.valueOf(j)).longValue();
        }
        TPLogUtil.m21897i(TAG, "toTPValue, nativeValue=" + j + "return default value, clazz" + cls);
        return ((TPNativeKeyMap.SearchConfig) cls.getAnnotation(TPNativeKeyMap.SearchConfig.class)).tpDefValue();
    }
}
