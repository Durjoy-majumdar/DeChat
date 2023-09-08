package com.google.android.gms.internal.wearable;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class zze {
    public static zzf zza(DataMap dataMap) {
        zzg zzg = new zzg();
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet(dataMap.keySet());
        zzh[] zzhArr = new zzh[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = dataMap.get(str);
            zzh zzh = new zzh();
            zzhArr[i] = zzh;
            zzh.name = str;
            zzh.zzga = zza(arrayList, obj);
            i++;
        }
        zzg.zzfy = zzhArr;
        return new zzf(zzg, arrayList);
    }

    private static zzi zza(List<Asset> list, Object obj) {
        zzi zzi = new zzi();
        if (obj == null) {
            zzi.type = 14;
            return zzi;
        }
        zzj zzj = new zzj();
        zzi.zzgc = zzj;
        if (obj instanceof String) {
            zzi.type = 2;
            zzj.zzge = (String) obj;
        } else if (obj instanceof Integer) {
            zzi.type = 6;
            zzj.zzgi = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            zzi.type = 5;
            zzj.zzgh = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            zzi.type = 3;
            zzj.zzgf = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            zzi.type = 4;
            zzj.zzgg = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            zzi.type = 8;
            zzj.zzgk = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            zzi.type = 7;
            zzj.zzgj = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            zzi.type = 1;
            zzj.zzgd = (byte[]) obj;
        } else if (obj instanceof String[]) {
            zzi.type = 11;
            zzj.zzgn = (String[]) obj;
        } else if (obj instanceof long[]) {
            zzi.type = 12;
            zzj.zzgo = (long[]) obj;
        } else if (obj instanceof float[]) {
            zzi.type = 15;
            zzj.zzgp = (float[]) obj;
        } else if (obj instanceof Asset) {
            zzi.type = 13;
            list.add((Asset) obj);
            zzj.zzgq = (long) (list.size() - 1);
        } else {
            int i = 0;
            if (obj instanceof DataMap) {
                zzi.type = 9;
                DataMap dataMap = (DataMap) obj;
                TreeSet treeSet = new TreeSet(dataMap.keySet());
                zzh[] zzhArr = new zzh[treeSet.size()];
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    zzh zzh = new zzh();
                    zzhArr[i] = zzh;
                    zzh.name = str;
                    zzh.zzga = zza(list, dataMap.get(str));
                    i++;
                }
                zzi.zzgc.zzgl = zzhArr;
            } else if (obj instanceof ArrayList) {
                zzi.type = 10;
                ArrayList arrayList = (ArrayList) obj;
                zzi[] zziArr = new zzi[arrayList.size()];
                Object obj2 = null;
                int size = arrayList.size();
                int i2 = 14;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    zzi zza = zza(list, obj3);
                    int i3 = zza.type;
                    if (i3 == 14 || i3 == 2 || i3 == 6 || i3 == 9) {
                        if (i2 == 14 && i3 != 14) {
                            obj2 = obj3;
                            i2 = i3;
                        } else if (i3 != i2) {
                            String valueOf = String.valueOf(obj2.getClass());
                            String valueOf2 = String.valueOf(obj3.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 80 + valueOf2.length());
                            sb.append("ArrayList elements must all be of the sameclass, but this one contains a ");
                            sb.append(valueOf);
                            sb.append(" and a ");
                            sb.append(valueOf2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                        zziArr[i] = zza;
                        i++;
                    } else {
                        String valueOf3 = String.valueOf(obj3.getClass());
                        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 130);
                        sb4.append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ");
                        sb4.append(valueOf3);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                }
                zzi.zzgc.zzgm = zziArr;
            } else {
                String simpleName = obj.getClass().getSimpleName();
                throw new RuntimeException(simpleName.length() != 0 ? "newFieldValueFromValue: unexpected value ".concat(simpleName) : new String("newFieldValueFromValue: unexpected value "));
            }
        }
        return zzi;
    }

    public static DataMap zza(zzf zzf) {
        DataMap dataMap = new DataMap();
        for (zzh zzh : zzf.zzfw.zzfy) {
            zza(zzf.zzfx, dataMap, zzh.name, zzh.zzga);
        }
        return dataMap;
    }

    private static void zza(List<Asset> list, DataMap dataMap, String str, zzi zzi) {
        List<Asset> list2 = list;
        DataMap dataMap2 = dataMap;
        String str2 = str;
        zzi zzi2 = zzi;
        int i = zzi2.type;
        Object obj = null;
        int i2 = 14;
        if (i == 14) {
            dataMap2.putString(str2, (String) null);
            return;
        }
        zzj zzj = zzi2.zzgc;
        if (i == 1) {
            dataMap2.putByteArray(str2, zzj.zzgd);
        } else if (i == 11) {
            dataMap2.putStringArray(str2, zzj.zzgn);
        } else if (i == 12) {
            dataMap2.putLongArray(str2, zzj.zzgo);
        } else if (i == 15) {
            dataMap2.putFloatArray(str2, zzj.zzgp);
        } else if (i == 2) {
            dataMap2.putString(str2, zzj.zzge);
        } else if (i == 3) {
            dataMap2.putDouble(str2, zzj.zzgf);
        } else if (i == 4) {
            dataMap2.putFloat(str2, zzj.zzgg);
        } else if (i == 5) {
            dataMap2.putLong(str2, zzj.zzgh);
        } else if (i == 6) {
            dataMap2.putInt(str2, zzj.zzgi);
        } else if (i == 7) {
            dataMap2.putByte(str2, (byte) zzj.zzgj);
        } else if (i == 8) {
            dataMap2.putBoolean(str2, zzj.zzgk);
        } else if (i != 13) {
            int i3 = 9;
            if (i == 9) {
                DataMap dataMap3 = new DataMap();
                for (zzh zzh : zzj.zzgl) {
                    zza(list2, dataMap3, zzh.name, zzh.zzga);
                }
                dataMap2.putDataMap(str2, dataMap3);
            } else if (i == 10) {
                int i4 = 14;
                for (zzi zzi3 : zzj.zzgm) {
                    int i5 = zzi3.type;
                    if (i4 == 14) {
                        if (i5 == 9 || i5 == 2 || i5 == 6) {
                            i4 = i5;
                        } else if (i5 != 14) {
                            int i6 = zzi3.type;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
                            sb.append("Unexpected TypedValue type: ");
                            sb.append(i6);
                            sb.append(" for key ");
                            sb.append(str2);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else if (i5 != i4) {
                        int i7 = zzi3.type;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 126);
                        sb4.append("The ArrayList elements should all be the same type, but ArrayList with key ");
                        sb4.append(str2);
                        sb4.append(" contains items of type ");
                        sb4.append(i4);
                        sb4.append(" and ");
                        sb4.append(i7);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                }
                ArrayList arrayList = new ArrayList(zzj.zzgm.length);
                zzi[] zziArr = zzj.zzgm;
                int length = zziArr.length;
                int i8 = 0;
                while (i8 < length) {
                    zzi zzi4 = zziArr[i8];
                    if (zzi4.type != i2) {
                        if (i4 == i3) {
                            DataMap dataMap4 = new DataMap();
                            for (zzh zzh2 : zzi4.zzgc.zzgl) {
                                zza(list2, dataMap4, zzh2.name, zzh2.zzga);
                            }
                            arrayList.add(dataMap4);
                            i8++;
                            obj = null;
                            i2 = 14;
                            i3 = 9;
                        } else if (i4 == 2) {
                            obj = zzi4.zzgc.zzge;
                        } else if (i4 == 6) {
                            obj = Integer.valueOf(zzi4.zzgc.zzgi);
                        } else {
                            StringBuilder sb5 = new StringBuilder(39);
                            sb5.append("Unexpected typeOfArrayList: ");
                            sb5.append(i4);
                            throw new IllegalArgumentException(sb5.toString());
                        }
                    }
                    arrayList.add(obj);
                    i8++;
                    obj = null;
                    i2 = 14;
                    i3 = 9;
                }
                if (i4 == 14) {
                    dataMap2.putStringArrayList(str2, arrayList);
                } else if (i4 == 9) {
                    dataMap2.putDataMapArrayList(str2, arrayList);
                } else if (i4 == 2) {
                    dataMap2.putStringArrayList(str2, arrayList);
                } else if (i4 == 6) {
                    dataMap2.putIntegerArrayList(str2, arrayList);
                } else {
                    StringBuilder sb6 = new StringBuilder(39);
                    sb6.append("Unexpected typeOfArrayList: ");
                    sb6.append(i4);
                    throw new IllegalStateException(sb6.toString());
                }
            } else {
                StringBuilder sb7 = new StringBuilder(43);
                sb7.append("populateBundle: unexpected type ");
                sb7.append(i);
                throw new RuntimeException(sb7.toString());
            }
        } else if (list2 == null) {
            String valueOf = String.valueOf(str);
            throw new RuntimeException(valueOf.length() != 0 ? "populateBundle: unexpected type for: ".concat(valueOf) : new String("populateBundle: unexpected type for: "));
        } else {
            dataMap2.putAsset(str2, list2.get((int) zzj.zzgq));
        }
    }
}
