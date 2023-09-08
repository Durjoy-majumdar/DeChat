package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new SafeParcelResponseCreator();
    private final String mClassName;
    private final int zzal;
    private final FieldMappingDictionary zzwn;
    private final Parcel zzxq;
    private final int zzxr;
    private int zzxs;
    private int zzxt;

    public SafeParcelResponse(int i, Parcel parcel, FieldMappingDictionary fieldMappingDictionary) {
        this.zzal = i;
        this.zzxq = (Parcel) Preconditions.checkNotNull(parcel);
        this.zzxr = 2;
        this.zzwn = fieldMappingDictionary;
        this.mClassName = fieldMappingDictionary == null ? null : fieldMappingDictionary.getRootClassName();
        this.zzxs = 2;
    }

    private SafeParcelResponse(SafeParcelable safeParcelable, FieldMappingDictionary fieldMappingDictionary, String str) {
        this.zzal = 1;
        Parcel obtain = Parcel.obtain();
        this.zzxq = obtain;
        safeParcelable.writeToParcel(obtain, 0);
        this.zzxr = 1;
        this.zzwn = (FieldMappingDictionary) Preconditions.checkNotNull(fieldMappingDictionary);
        this.mClassName = (String) Preconditions.checkNotNull(str);
        this.zzxs = 2;
    }

    public SafeParcelResponse(FieldMappingDictionary fieldMappingDictionary) {
        this(fieldMappingDictionary, fieldMappingDictionary.getRootClassName());
    }

    public SafeParcelResponse(FieldMappingDictionary fieldMappingDictionary, String str) {
        this.zzal = 1;
        this.zzxq = Parcel.obtain();
        this.zzxr = 0;
        this.zzwn = (FieldMappingDictionary) Preconditions.checkNotNull(fieldMappingDictionary);
        this.mClassName = (String) Preconditions.checkNotNull(str);
        this.zzxs = 0;
    }

    public static HashMap<String, String> convertBundleToStringMap(Bundle bundle) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String next : bundle.keySet()) {
            hashMap.put(next, bundle.getString(next));
        }
        return hashMap;
    }

    public static Bundle convertStringMapToBundle(HashMap<String, String> hashMap) {
        Bundle bundle = new Bundle();
        for (String next : hashMap.keySet()) {
            bundle.putString(next, hashMap.get(next));
        }
        return bundle;
    }

    public static <T extends FastJsonResponse & SafeParcelable> SafeParcelResponse from(T t) {
        String canonicalName = t.getClass().getCanonicalName();
        return new SafeParcelResponse((SafeParcelable) t, zza(t), canonicalName);
    }

    public static FieldMappingDictionary generateDictionary(Class<? extends FastJsonResponse> cls) {
        try {
            return zza((FastJsonResponse) cls.newInstance());
        } catch (InstantiationException e) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            throw new IllegalStateException(valueOf.length() != 0 ? "Could not instantiate an object of type ".concat(valueOf) : new String("Could not instantiate an object of type "), e);
        } catch (IllegalAccessException e2) {
            String valueOf2 = String.valueOf(cls.getCanonicalName());
            throw new IllegalStateException(valueOf2.length() != 0 ? "Could not access object of type ".concat(valueOf2) : new String("Could not access object of type "), e2);
        }
    }

    private static FieldMappingDictionary zza(FastJsonResponse fastJsonResponse) {
        FieldMappingDictionary fieldMappingDictionary = new FieldMappingDictionary(fastJsonResponse.getClass());
        zza(fieldMappingDictionary, fastJsonResponse);
        fieldMappingDictionary.copyInternalFieldMappings();
        fieldMappingDictionary.linkFields();
        return fieldMappingDictionary;
    }

    private static void zza(FieldMappingDictionary fieldMappingDictionary, FastJsonResponse fastJsonResponse) {
        Class<?> cls = fastJsonResponse.getClass();
        if (!fieldMappingDictionary.hasFieldMappingForClass(cls)) {
            Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
            fieldMappingDictionary.put(cls, fieldMappings);
            for (String str : fieldMappings.keySet()) {
                FastJsonResponse.Field field = fieldMappings.get(str);
                Class<? extends FastJsonResponse> concreteType = field.getConcreteType();
                if (concreteType != null) {
                    try {
                        zza(fieldMappingDictionary, (FastJsonResponse) concreteType.newInstance());
                    } catch (InstantiationException e) {
                        String valueOf = String.valueOf(field.getConcreteType().getCanonicalName());
                        throw new IllegalStateException(valueOf.length() != 0 ? "Could not instantiate an object of type ".concat(valueOf) : new String("Could not instantiate an object of type "), e);
                    } catch (IllegalAccessException e2) {
                        String valueOf2 = String.valueOf(field.getConcreteType().getCanonicalName());
                        throw new IllegalStateException(valueOf2.length() != 0 ? "Could not access object of type ".concat(valueOf2) : new String("Could not access object of type "), e2);
                    }
                }
            }
        }
    }

    private static void zza(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append(FastJsonResponse.QUOTE);
                sb.append(JsonUtils.escapeString(obj.toString()));
                sb.append(FastJsonResponse.QUOTE);
                return;
            case 8:
                sb.append(FastJsonResponse.QUOTE);
                sb.append(Base64Utils.encode((byte[]) obj));
                sb.append(FastJsonResponse.QUOTE);
                return;
            case 9:
                sb.append(FastJsonResponse.QUOTE);
                sb.append(Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append(FastJsonResponse.QUOTE);
                return;
            case 10:
                MapUtils.writeStringMapToJson(sb, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                StringBuilder sb4 = new StringBuilder(26);
                sb4.append("Unknown type = ");
                sb4.append(i);
                throw new IllegalArgumentException(sb4.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0201, code lost:
        r11.append(r3);
        r11.append(com.google.android.gms.common.server.response.FastJsonResponse.QUOTE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0231, code lost:
        r11.append(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza(java.lang.StringBuilder r11, java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> r12, android.os.Parcel r13) {
        /*
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x000d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.getSafeParcelableFieldId()
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0027:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0033:
            int r4 = r13.dataPosition()
            if (r4 >= r12) goto L_0x023f
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r4)
            java.lang.Object r5 = r0.get(r5)
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            if (r5 == 0) goto L_0x0033
            java.lang.String r6 = ","
            if (r3 == 0) goto L_0x0050
            r11.append(r6)
        L_0x0050:
            java.lang.Object r3 = r5.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r5.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            java.lang.String r7 = "\""
            r11.append(r7)
            r11.append(r3)
            java.lang.String r3 = "\":"
            r11.append(r3)
            boolean r3 = r5.hasConverter()
            if (r3 == 0) goto L_0x00ed
            int r3 = r5.getTypeOut()
            switch(r3) {
                case 0: goto L_0x00dc;
                case 1: goto L_0x00d7;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00a9;
                case 8: goto L_0x00a4;
                case 9: goto L_0x00a4;
                case 10: goto L_0x009b;
                case 11: goto L_0x0093;
                default: goto L_0x0076;
            }
        L_0x0076:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            int r12 = r5.getTypeOut()
            r13 = 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            java.lang.String r13 = "Unknown field out type = "
            r0.append(r13)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L_0x0093:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Method does not accept concrete type."
            r11.<init>(r12)
            throw r11
        L_0x009b:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r4)
            java.util.HashMap r3 = convertBundleToStringMap(r3)
            goto L_0x00e4
        L_0x00a4:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r4)
            goto L_0x00e4
        L_0x00a9:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r4)
            goto L_0x00e4
        L_0x00ae:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x00e4
        L_0x00b7:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r4)
            goto L_0x00e4
        L_0x00bc:
            double r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            goto L_0x00e4
        L_0x00c5:
            float r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r4)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x00e4
        L_0x00ce:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r4)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x00e4
        L_0x00d7:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r4)
            goto L_0x00e4
        L_0x00dc:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x00e4:
            java.lang.Object r3 = r10.getOriginalValue(r5, r3)
            r10.zzb(r11, r5, r3)
            goto L_0x023c
        L_0x00ed:
            boolean r3 = r5.isTypeOutArray()
            if (r3 == 0) goto L_0x0173
            java.lang.String r3 = "["
            r11.append(r3)
            int r3 = r5.getTypeOut()
            switch(r3) {
                case 0: goto L_0x0165;
                case 1: goto L_0x015d;
                case 2: goto L_0x0155;
                case 3: goto L_0x014d;
                case 4: goto L_0x0145;
                case 5: goto L_0x013d;
                case 6: goto L_0x0135;
                case 7: goto L_0x012d;
                case 8: goto L_0x0125;
                case 9: goto L_0x0125;
                case 10: goto L_0x0125;
                case 11: goto L_0x0107;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out."
            r11.<init>(r12)
            throw r11
        L_0x0107:
            android.os.Parcel[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(r13, r4)
            int r4 = r3.length
            r7 = 0
        L_0x010d:
            if (r7 >= r4) goto L_0x016c
            if (r7 <= 0) goto L_0x0114
            r11.append(r6)
        L_0x0114:
            r8 = r3[r7]
            r8.setDataPosition(r2)
            java.util.Map r8 = r5.getConcreteTypeFieldMappingFromDictionary()
            r9 = r3[r7]
            r10.zza((java.lang.StringBuilder) r11, (java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>>) r8, (android.os.Parcel) r9)
            int r7 = r7 + 1
            goto L_0x010d
        L_0x0125:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r12 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r11.<init>(r12)
            throw r11
        L_0x012d:
            java.lang.String[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeStringArray(r11, r3)
            goto L_0x016c
        L_0x0135:
            boolean[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (boolean[]) r3)
            goto L_0x016c
        L_0x013d:
            java.math.BigDecimal[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (T[]) r3)
            goto L_0x016c
        L_0x0145:
            double[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (double[]) r3)
            goto L_0x016c
        L_0x014d:
            float[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (float[]) r3)
            goto L_0x016c
        L_0x0155:
            long[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (long[]) r3)
            goto L_0x016c
        L_0x015d:
            java.math.BigInteger[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (T[]) r3)
            goto L_0x016c
        L_0x0165:
            int[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r13, r4)
            com.google.android.gms.common.util.ArrayUtils.writeArray((java.lang.StringBuilder) r11, (int[]) r3)
        L_0x016c:
            java.lang.String r3 = "]"
        L_0x016e:
            r11.append(r3)
            goto L_0x023c
        L_0x0173:
            int r3 = r5.getTypeOut()
            switch(r3) {
                case 0: goto L_0x0235;
                case 1: goto L_0x022d;
                case 2: goto L_0x0225;
                case 3: goto L_0x021d;
                case 4: goto L_0x0215;
                case 5: goto L_0x0210;
                case 6: goto L_0x0208;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01ea;
                case 9: goto L_0x01de;
                case 10: goto L_0x0192;
                case 11: goto L_0x0182;
                default: goto L_0x017a;
            }
        L_0x017a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Unknown field type out"
            r11.<init>(r12)
            throw r11
        L_0x0182:
            android.os.Parcel r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(r13, r4)
            r3.setDataPosition(r2)
            java.util.Map r4 = r5.getConcreteTypeFieldMappingFromDictionary()
            r10.zza((java.lang.StringBuilder) r11, (java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>>) r4, (android.os.Parcel) r3)
            goto L_0x023c
        L_0x0192:
            android.os.Bundle r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r4)
            java.util.Set r4 = r3.keySet()
            r4.size()
            java.lang.String r5 = "{"
            r11.append(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 1
        L_0x01a8:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x01da
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r5 != 0) goto L_0x01b9
            r11.append(r6)
        L_0x01b9:
            r11.append(r7)
            r11.append(r8)
            r11.append(r7)
            java.lang.String r5 = ":"
            r11.append(r5)
            r11.append(r7)
            java.lang.String r5 = r3.getString(r8)
            java.lang.String r5 = com.google.android.gms.common.util.JsonUtils.escapeString(r5)
            r11.append(r5)
            r11.append(r7)
            r5 = 0
            goto L_0x01a8
        L_0x01da:
            java.lang.String r3 = "}"
            goto L_0x016e
        L_0x01de:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r3)
            goto L_0x0201
        L_0x01ea:
            byte[] r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r3)
            goto L_0x0201
        L_0x01f6:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r4)
            r11.append(r7)
            java.lang.String r3 = com.google.android.gms.common.util.JsonUtils.escapeString(r3)
        L_0x0201:
            r11.append(r3)
            r11.append(r7)
            goto L_0x023c
        L_0x0208:
            boolean r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r4)
            r11.append(r3)
            goto L_0x023c
        L_0x0210:
            java.math.BigDecimal r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r4)
            goto L_0x0231
        L_0x0215:
            double r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r4)
            r11.append(r3)
            goto L_0x023c
        L_0x021d:
            float r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r4)
            r11.append(r3)
            goto L_0x023c
        L_0x0225:
            long r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r4)
            r11.append(r3)
            goto L_0x023c
        L_0x022d:
            java.math.BigInteger r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r4)
        L_0x0231:
            r11.append(r3)
            goto L_0x023c
        L_0x0235:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r4)
            r11.append(r3)
        L_0x023c:
            r3 = 1
            goto L_0x0033
        L_0x023f:
            int r0 = r13.dataPosition()
            if (r0 != r12) goto L_0x024b
            r12 = 125(0x7d, float:1.75E-43)
            r11.append(r12)
            return
        L_0x024b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r11 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            r0 = 37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Overread allowed size end="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.<init>(r12, r13)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.zza(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    private final void zzb(FastJsonResponse.Field<?, ?> field) {
        if (field.isValidSafeParcelableFieldId()) {
            Parcel parcel = this.zzxq;
            if (parcel != null) {
                int i = this.zzxs;
                if (i == 0) {
                    this.zzxt = SafeParcelWriter.beginObjectHeader(parcel);
                    this.zzxs = 1;
                } else if (i == 1) {
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
                    }
                    throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
                }
            } else {
                throw new IllegalStateException("Internal Parcel object is null.");
            }
        } else {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
    }

    private final void zzb(StringBuilder sb, FastJsonResponse.Field<?, ?> field, Object obj) {
        if (field.isTypeInArray()) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                zza(sb, field.getTypeIn(), arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        zza(sb, field.getTypeIn(), obj);
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<T> arrayList) {
        zzb(field);
        ArrayList arrayList2 = new ArrayList();
        arrayList.size();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            T t = arrayList.get(i);
            i++;
            arrayList2.add(((SafeParcelResponse) ((FastJsonResponse) t)).getParcel());
        }
        SafeParcelWriter.writeParcelList(this.zzxq, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> field, String str, T t) {
        zzb(field);
        SafeParcelWriter.writeParcel(this.zzxq, field.getSafeParcelableFieldId(), ((SafeParcelResponse) t).getParcel(), true);
    }

    public Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        FieldMappingDictionary fieldMappingDictionary = this.zzwn;
        if (fieldMappingDictionary == null) {
            return null;
        }
        return fieldMappingDictionary.getFieldMapping(this.mClassName);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r0 != 1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcel getParcel() {
        /*
            r2 = this;
            int r0 = r2.zzxs
            if (r0 == 0) goto L_0x0008
            r1 = 1
            if (r0 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0008:
            android.os.Parcel r0 = r2.zzxq
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r0)
            r2.zzxt = r0
        L_0x0010:
            android.os.Parcel r0 = r2.zzxq
            int r1 = r2.zzxt
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r0, r1)
            r0 = 2
            r2.zzxs = r0
        L_0x001a:
            android.os.Parcel r0 = r2.zzxq
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.getParcel():android.os.Parcel");
    }

    public Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int getVersionCode() {
        return this.zzal;
    }

    public <T extends SafeParcelable> T inflate(Parcelable.Creator<T> creator) {
        Parcel parcel = getParcel();
        parcel.setDataPosition(0);
        return (SafeParcelable) creator.createFromParcel(parcel);
    }

    public boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public void setBigDecimalInternal(FastJsonResponse.Field<?, ?> field, String str, BigDecimal bigDecimal) {
        zzb(field);
        SafeParcelWriter.writeBigDecimal(this.zzxq, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    public void setBigDecimalsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        zzb(field);
        int size = arrayList.size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeBigDecimalArray(this.zzxq, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    public void setBigIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, BigInteger bigInteger) {
        zzb(field);
        SafeParcelWriter.writeBigInteger(this.zzxq, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    public void setBigIntegersInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        zzb(field);
        int size = arrayList.size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeBigIntegerArray(this.zzxq, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    public void setBooleanInternal(FastJsonResponse.Field<?, ?> field, String str, boolean z) {
        zzb(field);
        SafeParcelWriter.writeBoolean(this.zzxq, field.getSafeParcelableFieldId(), z);
    }

    public void setBooleansInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        zzb(field);
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = arrayList.get(i).booleanValue();
        }
        SafeParcelWriter.writeBooleanArray(this.zzxq, field.getSafeParcelableFieldId(), zArr, true);
    }

    public void setDecodedBytesInternal(FastJsonResponse.Field<?, ?> field, String str, byte[] bArr) {
        zzb(field);
        SafeParcelWriter.writeByteArray(this.zzxq, field.getSafeParcelableFieldId(), bArr, true);
    }

    public void setDoubleInternal(FastJsonResponse.Field<?, ?> field, String str, double d) {
        zzb(field);
        SafeParcelWriter.writeDouble(this.zzxq, field.getSafeParcelableFieldId(), d);
    }

    public void setDoublesInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        zzb(field);
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = arrayList.get(i).doubleValue();
        }
        SafeParcelWriter.writeDoubleArray(this.zzxq, field.getSafeParcelableFieldId(), dArr, true);
    }

    public void setFloatInternal(FastJsonResponse.Field<?, ?> field, String str, float f) {
        zzb(field);
        SafeParcelWriter.writeFloat(this.zzxq, field.getSafeParcelableFieldId(), f);
    }

    public void setFloatsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        zzb(field);
        int size = arrayList.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = arrayList.get(i).floatValue();
        }
        SafeParcelWriter.writeFloatArray(this.zzxq, field.getSafeParcelableFieldId(), fArr, true);
    }

    public void setIntegerInternal(FastJsonResponse.Field<?, ?> field, String str, int i) {
        zzb(field);
        SafeParcelWriter.writeInt(this.zzxq, field.getSafeParcelableFieldId(), i);
    }

    public void setIntegersInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        zzb(field);
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = arrayList.get(i).intValue();
        }
        SafeParcelWriter.writeIntArray(this.zzxq, field.getSafeParcelableFieldId(), iArr, true);
    }

    public void setLongInternal(FastJsonResponse.Field<?, ?> field, String str, long j) {
        zzb(field);
        SafeParcelWriter.writeLong(this.zzxq, field.getSafeParcelableFieldId(), j);
    }

    public void setLongsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        zzb(field);
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = arrayList.get(i).longValue();
        }
        SafeParcelWriter.writeLongArray(this.zzxq, field.getSafeParcelableFieldId(), jArr, true);
    }

    public void setStringInternal(FastJsonResponse.Field<?, ?> field, String str, String str2) {
        zzb(field);
        SafeParcelWriter.writeString(this.zzxq, field.getSafeParcelableFieldId(), str2, true);
    }

    public void setStringMapInternal(FastJsonResponse.Field<?, ?> field, String str, Map<String, String> map) {
        zzb(field);
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            bundle.putString(next, map.get(next));
        }
        SafeParcelWriter.writeBundle(this.zzxq, field.getSafeParcelableFieldId(), bundle, true);
    }

    public void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        zzb(field);
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        SafeParcelWriter.writeStringArray(this.zzxq, field.getSafeParcelableFieldId(), strArr, true);
    }

    public String toString() {
        Preconditions.checkNotNull(this.zzwn, "Cannot convert to JSON on client side.");
        Parcel parcel = getParcel();
        parcel.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        zza(sb, this.zzwn.getFieldMapping(this.mClassName), parcel);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        FieldMappingDictionary fieldMappingDictionary;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeParcel(parcel, 2, getParcel(), false);
        int i2 = this.zzxr;
        if (i2 == 0) {
            fieldMappingDictionary = null;
        } else if (i2 == 1 || i2 == 2) {
            fieldMappingDictionary = this.zzwn;
        } else {
            int i3 = this.zzxr;
            StringBuilder sb = new StringBuilder(34);
            sb.append("Invalid creation type: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        SafeParcelWriter.writeParcelable(parcel, 3, fieldMappingDictionary, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
