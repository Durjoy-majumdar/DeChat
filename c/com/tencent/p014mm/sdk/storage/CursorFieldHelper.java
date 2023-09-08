package com.tencent.p014mm.sdk.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.storage.CursorFieldHelper */
class CursorFieldHelper {
    private static final Map<Class<?>, IGetMethod> GET_METHODS;
    private static final Map<Class<?>, String> GET_TYPE;
    private static final Map<Class<?>, ISetMethod> SET_METHODS;
    private static final String TAG = "MicroMsg.SDK.CursorFieldHelper";

    /* renamed from: com.tencent.mm.sdk.storage.CursorFieldHelper$IGetMethod */
    public interface IGetMethod {
        void invoke(Field field, Object obj, ContentValues contentValues);
    }

    /* renamed from: com.tencent.mm.sdk.storage.CursorFieldHelper$ISetMethod */
    public interface ISetMethod {
        void invoke(Field field, Object obj, Cursor cursor, int i);
    }

    static {
        Class<String> cls = String.class;
        Class<Long> cls2 = Long.class;
        Class<Double> cls3 = Double.class;
        Class<Float> cls4 = Float.class;
        Class<Integer> cls5 = Integer.class;
        Class<Boolean> cls6 = Boolean.class;
        Class<Short> cls7 = Short.class;
        Class<byte[]> cls8 = byte[].class;
        HashMap hashMap = new HashMap();
        SET_METHODS = hashMap;
        HashMap hashMap2 = new HashMap();
        GET_METHODS = hashMap2;
        HashMap hashMap3 = new HashMap();
        GET_TYPE = hashMap3;
        Object obj = "LONG";
        try {
            hashMap.put(cls8, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setBlob(field, obj, cursor, i);
                }
            });
            hashMap.put(Short.TYPE, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setShort(field, obj, cursor, i);
                }
            });
            hashMap.put(cls7, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setShort(field, obj, cursor, i);
                }
            });
            Class cls9 = Boolean.TYPE;
            hashMap.put(cls9, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setBoolean(field, obj, cursor, i);
                }
            });
            hashMap.put(cls6, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setBoolean(field, obj, cursor, i);
                }
            });
            Class cls10 = Integer.TYPE;
            hashMap.put(cls10, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setInt(field, obj, cursor, i);
                }
            });
            hashMap.put(cls5, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setInt(field, obj, cursor, i);
                }
            });
            Class cls11 = Float.TYPE;
            hashMap.put(cls11, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setFloat(field, obj, cursor, i);
                }
            });
            hashMap.put(cls4, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setFloat(field, obj, cursor, i);
                }
            });
            hashMap.put(Double.TYPE, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setDouble(field, obj, cursor, i);
                }
            });
            hashMap.put(cls3, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setDouble(field, obj, cursor, i);
                }
            });
            Class cls12 = Long.TYPE;
            hashMap.put(cls12, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setLong(field, obj, cursor, i);
                }
            });
            hashMap.put(cls2, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setLong(field, obj, cursor, i);
                }
            });
            hashMap.put(cls, new ISetMethod() {
                public void invoke(Field field, Object obj, Cursor cursor, int i) {
                    CursorFieldHelper.keep_setString(field, obj, cursor, i);
                }
            });
            hashMap2.put(cls8, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getBlob(field, obj, contentValues);
                }
            });
            hashMap2.put(Short.TYPE, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getShort(field, obj, contentValues);
                }
            });
            hashMap2.put(cls7, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getShort(field, obj, contentValues);
                }
            });
            hashMap2.put(cls9, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getBoolean(field, obj, contentValues);
                }
            });
            hashMap2.put(cls6, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getBoolean(field, obj, contentValues);
                }
            });
            hashMap2.put(cls10, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getInt(field, obj, contentValues);
                }
            });
            hashMap2.put(cls5, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getInt(field, obj, contentValues);
                }
            });
            hashMap2.put(cls11, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getFloat(field, obj, contentValues);
                }
            });
            hashMap2.put(cls4, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getFloat(field, obj, contentValues);
                }
            });
            hashMap2.put(Double.TYPE, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getDouble(field, obj, contentValues);
                }
            });
            hashMap2.put(cls3, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getDouble(field, obj, contentValues);
                }
            });
            hashMap2.put(cls12, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getLong(field, obj, contentValues);
                }
            });
            hashMap2.put(cls2, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getLong(field, obj, contentValues);
                }
            });
            hashMap2.put(cls, new IGetMethod() {
                public void invoke(Field field, Object obj, ContentValues contentValues) {
                    CursorFieldHelper.keep_getString(field, obj, contentValues);
                }
            });
            hashMap3.put(cls8, "BLOB");
            Object obj2 = "SHORT";
            hashMap3.put(Short.TYPE, obj2);
            hashMap3.put(cls7, obj2);
            Object obj3 = "INTEGER";
            hashMap3.put(cls9, obj3);
            hashMap3.put(cls6, obj3);
            hashMap3.put(cls10, obj3);
            hashMap3.put(cls5, obj3);
            Object obj4 = "FLOAT";
            hashMap3.put(cls11, obj4);
            hashMap3.put(cls4, obj4);
            Object obj5 = "DOUBLE";
            hashMap3.put(Double.TYPE, obj5);
            hashMap3.put(cls3, obj5);
            Object obj6 = obj;
            hashMap3.put(cls12, obj6);
            hashMap3.put(cls2, obj6);
            hashMap3.put(cls, "TEXT");
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static IGetMethod getter(Class<?> cls) {
        return GET_METHODS.get(cls);
    }

    public static void keep_getBlob(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(IAutoDBItem.getColName(field), (byte[]) field.get(obj));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getBoolean(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(IAutoDBItem.getColName(field), Integer.valueOf(field.getBoolean(obj) ? 1 : 0));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getDouble(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Double.TYPE)) {
                contentValues.put(IAutoDBItem.getColName(field), (Double) field.get(obj));
            } else {
                contentValues.put(IAutoDBItem.getColName(field), Double.valueOf(field.getDouble(obj)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getFloat(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Float.TYPE)) {
                contentValues.put(IAutoDBItem.getColName(field), (Float) field.get(obj));
            } else {
                contentValues.put(IAutoDBItem.getColName(field), Float.valueOf(field.getFloat(obj)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getInt(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Integer.TYPE)) {
                contentValues.put(IAutoDBItem.getColName(field), (Integer) field.get(obj));
            } else {
                contentValues.put(IAutoDBItem.getColName(field), Integer.valueOf(field.getInt(obj)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getLong(Field field, Object obj, ContentValues contentValues) {
        try {
            if (!field.getType().equals(Long.TYPE)) {
                contentValues.put(IAutoDBItem.getColName(field), (Long) field.get(obj));
            } else {
                contentValues.put(IAutoDBItem.getColName(field), Long.valueOf(field.getLong(obj)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getShort(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(IAutoDBItem.getColName(field), Short.valueOf(field.getShort(obj)));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_getString(Field field, Object obj, ContentValues contentValues) {
        try {
            contentValues.put(IAutoDBItem.getColName(field), (String) field.get(obj));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setBlob(Field field, Object obj, Cursor cursor, int i) {
        try {
            field.set(obj, cursor.getBlob(i));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setBoolean(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Boolean.TYPE)) {
                field.setBoolean(obj, cursor.getInt(i) != 0);
            } else {
                field.set(obj, Integer.valueOf(cursor.getInt(i)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setDouble(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Double.TYPE)) {
                field.setDouble(obj, cursor.getDouble(i));
            } else {
                field.set(obj, Double.valueOf(cursor.getDouble(i)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setFloat(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Float.TYPE)) {
                field.setFloat(obj, cursor.getFloat(i));
            } else {
                field.set(obj, Float.valueOf(cursor.getFloat(i)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setInt(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Integer.TYPE)) {
                field.setInt(obj, cursor.getInt(i));
            } else {
                field.set(obj, Integer.valueOf(cursor.getInt(i)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setLong(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Long.TYPE)) {
                field.setLong(obj, cursor.getLong(i));
            } else {
                field.set(obj, Long.valueOf(cursor.getLong(i)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setShort(Field field, Object obj, Cursor cursor, int i) {
        try {
            if (field.getType().equals(Short.TYPE)) {
                field.setShort(obj, cursor.getShort(i));
            } else {
                field.set(obj, Short.valueOf(cursor.getShort(i)));
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void keep_setString(Field field, Object obj, Cursor cursor, int i) {
        try {
            field.set(obj, cursor.getString(i));
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static ISetMethod setter(Class<?> cls) {
        return SET_METHODS.get(cls);
    }

    public static String type(Class<?> cls) {
        return GET_TYPE.get(cls);
    }
}
