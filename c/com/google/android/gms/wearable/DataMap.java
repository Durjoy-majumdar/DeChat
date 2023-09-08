package com.google.android.gms.wearable;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.zze;
import com.google.android.gms.internal.wearable.zzf;
import com.google.android.gms.internal.wearable.zzg;
import com.google.android.gms.internal.wearable.zzs;
import com.google.android.gms.internal.wearable.zzt;
import com.tencent.tav.asset.Asset;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class DataMap {
    public static final String TAG = "DataMap";
    private final HashMap<String, Object> zzq = new HashMap<>();

    public static ArrayList<DataMap> arrayListFromBundleArrayList(ArrayList<Bundle> arrayList) {
        ArrayList<DataMap> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Bundle bundle = arrayList.get(i);
            i++;
            arrayList2.add(fromBundle(bundle));
        }
        return arrayList2;
    }

    public static DataMap fromBundle(Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        DataMap dataMap = new DataMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj instanceof String) {
                dataMap.putString(next, (String) obj);
            } else if (obj instanceof Integer) {
                dataMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                dataMap.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                dataMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                dataMap.putFloat(next, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                dataMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataMap.putByte(next, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                dataMap.putByteArray(next, (byte[]) obj);
            } else if (obj instanceof String[]) {
                dataMap.putStringArray(next, (String[]) obj);
            } else if (obj instanceof long[]) {
                dataMap.putLongArray(next, (long[]) obj);
            } else if (obj instanceof float[]) {
                dataMap.putFloatArray(next, (float[]) obj);
            } else if (obj instanceof Asset) {
                dataMap.putAsset(next, (Asset) obj);
            } else if (obj instanceof Bundle) {
                dataMap.putDataMap(next, fromBundle((Bundle) obj));
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int zza = zza(arrayList);
                if (!(zza == 0 || zza == 1)) {
                    if (zza == 2) {
                        dataMap.putIntegerArrayList(next, arrayList);
                    } else if (zza != 3) {
                        if (zza == 5) {
                            dataMap.putDataMapArrayList(next, arrayListFromBundleArrayList(arrayList));
                        }
                    }
                }
                dataMap.putStringArrayList(next, arrayList);
            }
        }
        return dataMap;
    }

    public static DataMap fromByteArray(byte[] bArr) {
        try {
            return zze.zza(new zzf(zzg.zza(bArr), new ArrayList()));
        } catch (zzs e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    private static int zza(ArrayList<?> arrayList) {
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                if (obj instanceof Integer) {
                    return 2;
                }
                if (obj instanceof String) {
                    return 3;
                }
                if (obj instanceof DataMap) {
                    return 4;
                }
                if (obj instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    private static void zza(String str, Object obj, String str2, ClassCastException classCastException) {
        zza(str, obj, str2, "<null>", classCastException);
    }

    private static void zza(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        obj.getClass();
        Objects.toString(obj2);
    }

    public void clear() {
        this.zzq.clear();
    }

    public boolean containsKey(String str) {
        return this.zzq.containsKey(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cb A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.wearable.DataMap
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.wearable.DataMap r7 = (com.google.android.gms.wearable.DataMap) r7
            int r0 = r6.size()
            int r2 = r7.size()
            if (r0 == r2) goto L_0x0013
            return r1
        L_0x0013:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001b:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r6.get(r2)
            java.lang.Object r2 = r7.get(r2)
            boolean r5 = r4 instanceof com.google.android.gms.wearable.Asset
            if (r5 == 0) goto L_0x006d
            boolean r5 = r2 instanceof com.google.android.gms.wearable.Asset
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0039:
            com.google.android.gms.wearable.Asset r4 = (com.google.android.gms.wearable.Asset) r4
            com.google.android.gms.wearable.Asset r2 = (com.google.android.gms.wearable.Asset) r2
            if (r4 == 0) goto L_0x0066
            if (r2 != 0) goto L_0x0042
            goto L_0x0066
        L_0x0042:
            java.lang.String r3 = r4.getDigest()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0059
            java.lang.String r3 = r4.getDigest()
            java.lang.String r2 = r2.getDigest()
            boolean r3 = r3.equals(r2)
            goto L_0x006a
        L_0x0059:
            byte[] r3 = r4.getData()
            byte[] r2 = r2.getData()
            boolean r3 = java.util.Arrays.equals(r3, r2)
            goto L_0x006a
        L_0x0066:
            if (r4 != r2) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 != 0) goto L_0x001b
            return r1
        L_0x006d:
            boolean r5 = r4 instanceof java.lang.String[]
            if (r5 == 0) goto L_0x0081
            boolean r3 = r2 instanceof java.lang.String[]
            if (r3 != 0) goto L_0x0076
            return r1
        L_0x0076:
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String[] r2 = (java.lang.String[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x0081:
            boolean r5 = r4 instanceof long[]
            if (r5 == 0) goto L_0x0095
            boolean r3 = r2 instanceof long[]
            if (r3 != 0) goto L_0x008a
            return r1
        L_0x008a:
            long[] r4 = (long[]) r4
            long[] r2 = (long[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x0095:
            boolean r5 = r4 instanceof float[]
            if (r5 == 0) goto L_0x00a9
            boolean r3 = r2 instanceof float[]
            if (r3 != 0) goto L_0x009e
            return r1
        L_0x009e:
            float[] r4 = (float[]) r4
            float[] r2 = (float[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x00a9:
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x00bd
            boolean r3 = r2 instanceof byte[]
            if (r3 != 0) goto L_0x00b2
            return r1
        L_0x00b2:
            byte[] r4 = (byte[]) r4
            byte[] r2 = (byte[]) r2
            boolean r2 = java.util.Arrays.equals(r4, r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x00bd:
            if (r4 == 0) goto L_0x00c9
            if (r2 != 0) goto L_0x00c2
            goto L_0x00c9
        L_0x00c2:
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x001b
            return r1
        L_0x00c9:
            if (r4 == r2) goto L_0x00cc
            return r1
        L_0x00cc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.DataMap.equals(java.lang.Object):boolean");
    }

    public <T> T get(String str) {
        return this.zzq.get(str);
    }

    public Asset getAsset(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            zza(str, obj, Asset.TAG, e);
            return null;
        }
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(String str, boolean z) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            zza(str, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    public byte getByte(String str) {
        return getByte(str, (byte) 0);
    }

    public byte getByte(String str, byte b) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return b;
        }
        try {
            return ((Byte) obj).byteValue();
        } catch (ClassCastException e) {
            zza(str, obj, "Byte", Byte.valueOf(b), e);
            return b;
        }
    }

    public byte[] getByteArray(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "byte[]", e);
            return null;
        }
    }

    public DataMap getDataMap(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (DataMap) obj;
        } catch (ClassCastException e) {
            zza(str, obj, TAG, e);
            return null;
        }
    }

    public ArrayList<DataMap> getDataMapArrayList(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    public double getDouble(String str) {
        return getDouble(str, 0.0d);
    }

    public double getDouble(String str, double d) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            zza(str, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    public float getFloat(String str) {
        return getFloat(str, 0.0f);
    }

    public float getFloat(String str, float f) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            zza(str, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    public float[] getFloatArray(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "float[]", e);
            return null;
        }
    }

    public int getInt(String str) {
        return getInt(str, 0);
    }

    public int getInt(String str, int i) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            zza(str, obj, DownloadSetting.TYPE_INTEGER, e);
            return i;
        }
    }

    public ArrayList<Integer> getIntegerArrayList(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    public long getLong(String str) {
        return getLong(str, 0);
    }

    public long getLong(String str, long j) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            zza(str, obj, "long", e);
            return j;
        }
    }

    public long[] getLongArray(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "long[]", e);
            return null;
        }
    }

    public String getString(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "String", e);
            return null;
        }
    }

    public String getString(String str, String str2) {
        String string = getString(str);
        return string == null ? str2 : string;
    }

    public String[] getStringArray(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "String[]", e);
            return null;
        }
    }

    public ArrayList<String> getStringArrayList(String str) {
        Object obj = this.zzq.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            zza(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    public int hashCode() {
        return this.zzq.hashCode() * 29;
    }

    public boolean isEmpty() {
        return this.zzq.isEmpty();
    }

    public Set<String> keySet() {
        return this.zzq.keySet();
    }

    public void putAll(DataMap dataMap) {
        for (String next : dataMap.keySet()) {
            this.zzq.put(next, dataMap.get(next));
        }
    }

    public void putAsset(String str, Asset asset) {
        this.zzq.put(str, asset);
    }

    public void putBoolean(String str, boolean z) {
        this.zzq.put(str, Boolean.valueOf(z));
    }

    public void putByte(String str, byte b) {
        this.zzq.put(str, Byte.valueOf(b));
    }

    public void putByteArray(String str, byte[] bArr) {
        this.zzq.put(str, bArr);
    }

    public void putDataMap(String str, DataMap dataMap) {
        this.zzq.put(str, dataMap);
    }

    public void putDataMapArrayList(String str, ArrayList<DataMap> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public void putDouble(String str, double d) {
        this.zzq.put(str, Double.valueOf(d));
    }

    public void putFloat(String str, float f) {
        this.zzq.put(str, Float.valueOf(f));
    }

    public void putFloatArray(String str, float[] fArr) {
        this.zzq.put(str, fArr);
    }

    public void putInt(String str, int i) {
        this.zzq.put(str, Integer.valueOf(i));
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public void putLong(String str, long j) {
        this.zzq.put(str, Long.valueOf(j));
    }

    public void putLongArray(String str, long[] jArr) {
        this.zzq.put(str, jArr);
    }

    public void putString(String str, String str2) {
        this.zzq.put(str, str2);
    }

    public void putStringArray(String str, String[] strArr) {
        this.zzq.put(str, strArr);
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.zzq.put(str, arrayList);
    }

    public Object remove(String str) {
        return this.zzq.remove(str);
    }

    public int size() {
        return this.zzq.size();
    }

    public Bundle toBundle() {
        Parcelable bundle;
        Bundle bundle2 = new Bundle();
        for (String next : this.zzq.keySet()) {
            Object obj = this.zzq.get(next);
            if (obj instanceof String) {
                bundle2.putString(next, (String) obj);
            } else if (obj instanceof Integer) {
                bundle2.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle2.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle2.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle2.putFloat(next, ((Float) obj).floatValue());
            } else if (obj instanceof Boolean) {
                bundle2.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle2.putByte(next, ((Byte) obj).byteValue());
            } else if (obj instanceof byte[]) {
                bundle2.putByteArray(next, (byte[]) obj);
            } else if (obj instanceof String[]) {
                bundle2.putStringArray(next, (String[]) obj);
            } else if (obj instanceof long[]) {
                bundle2.putLongArray(next, (long[]) obj);
            } else if (obj instanceof float[]) {
                bundle2.putFloatArray(next, (float[]) obj);
            } else {
                if (obj instanceof Asset) {
                    bundle = (Asset) obj;
                } else if (obj instanceof DataMap) {
                    bundle = ((DataMap) obj).toBundle();
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    int zza = zza(arrayList);
                    if (!(zza == 0 || zza == 1)) {
                        if (zza == 2) {
                            bundle2.putIntegerArrayList(next, arrayList);
                        } else if (zza != 3) {
                            if (zza == 4) {
                                ArrayList arrayList2 = new ArrayList();
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    arrayList2.add(((DataMap) obj2).toBundle());
                                }
                                bundle2.putParcelableArrayList(next, arrayList2);
                            }
                        }
                    }
                    bundle2.putStringArrayList(next, arrayList);
                }
                bundle2.putParcelable(next, bundle);
            }
        }
        return bundle2;
    }

    public byte[] toByteArray() {
        return zzt.zzb(zze.zza(this).zzfw);
    }

    public String toString() {
        return this.zzq.toString();
    }
}
