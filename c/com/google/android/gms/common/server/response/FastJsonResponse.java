package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.JsonUtils;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public abstract class FastJsonResponse {
    public static final String QUOTE = "\"";
    private int zzwk;
    private byte[] zzwl;
    private boolean zzwm;

    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final FieldCreator CREATOR = new FieldCreator();
        public final Class<? extends FastJsonResponse> mConcreteType;
        public final String mConcreteTypeName;
        public final String mOutputFieldName;
        public final int mSafeParcelableFieldId;
        public final int mTypeIn;
        public final boolean mTypeInArray;
        public final int mTypeOut;
        public final boolean mTypeOutArray;
        private final int zzal;
        private FieldMappingDictionary zzwn;
        /* access modifiers changed from: private */
        public FieldConverter<I, O> zzwo;

        public Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, ConverterWrapper converterWrapper) {
            this.zzal = i;
            this.mTypeIn = i2;
            this.mTypeInArray = z;
            this.mTypeOut = i3;
            this.mTypeOutArray = z2;
            this.mOutputFieldName = str;
            this.mSafeParcelableFieldId = i4;
            if (str2 == null) {
                this.mConcreteType = null;
                this.mConcreteTypeName = null;
            } else {
                this.mConcreteType = SafeParcelResponse.class;
                this.mConcreteTypeName = str2;
            }
            if (converterWrapper == null) {
                this.zzwo = null;
            } else {
                this.zzwo = converterWrapper.unwrap();
            }
        }

        public Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class<? extends FastJsonResponse> cls, FieldConverter<I, O> fieldConverter) {
            this.zzal = 1;
            this.mTypeIn = i;
            this.mTypeInArray = z;
            this.mTypeOut = i2;
            this.mTypeOutArray = z2;
            this.mOutputFieldName = str;
            this.mSafeParcelableFieldId = i3;
            this.mConcreteType = cls;
            this.mConcreteTypeName = cls == null ? null : cls.getCanonicalName();
            this.zzwo = fieldConverter;
        }

        public static Field<byte[], byte[]> forBase64(String str) {
            return new Field(8, false, 8, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<byte[], byte[]> forBase64(String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<byte[], byte[]> forBase64UrlSafe(String str) {
            return new Field(9, false, 9, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<byte[], byte[]> forBase64UrlSafe(String str, int i) {
            return new Field(9, false, 9, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<BigDecimal, BigDecimal> forBigDecimal(String str) {
            return new Field(5, false, 5, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<BigDecimal, BigDecimal> forBigDecimal(String str, int i) {
            return new Field(5, false, 5, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<BigDecimal>, ArrayList<BigDecimal>> forBigDecimals(String str) {
            return new Field(5, true, 5, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<BigDecimal>, ArrayList<BigDecimal>> forBigDecimals(String str, int i) {
            return new Field(5, true, 5, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<BigInteger, BigInteger> forBigInteger(String str) {
            return new Field(1, false, 1, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<BigInteger, BigInteger> forBigInteger(String str, int i) {
            return new Field(1, false, 1, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<BigInteger>, ArrayList<BigInteger>> forBigIntegers(String str) {
            return new Field(0, true, 1, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<BigInteger>, ArrayList<BigInteger>> forBigIntegers(String str, int i) {
            return new Field(0, true, 1, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Boolean, Boolean> forBoolean(String str) {
            return new Field(6, false, 6, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Boolean, Boolean> forBoolean(String str, int i) {
            return new Field(6, false, 6, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Boolean>, ArrayList<Boolean>> forBooleans(String str) {
            return new Field(6, true, 6, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Boolean>, ArrayList<Boolean>> forBooleans(String str, int i) {
            return new Field(6, true, 6, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, int i, Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (FieldConverter) null);
        }

        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(String str, Class<T> cls) {
            return new Field(11, false, 11, false, str, -1, cls, (FieldConverter) null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, int i, Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (FieldConverter) null);
        }

        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(String str, Class<T> cls) {
            return new Field(11, true, 11, true, str, -1, cls, (FieldConverter) null);
        }

        public static Field<Double, Double> forDouble(String str) {
            return new Field(4, false, 4, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Double, Double> forDouble(String str, int i) {
            return new Field(4, false, 4, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Double>, ArrayList<Double>> forDoubles(String str) {
            return new Field(4, true, 4, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Double>, ArrayList<Double>> forDoubles(String str, int i) {
            return new Field(4, true, 4, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Float, Float> forFloat(String str) {
            return new Field(3, false, 3, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Float, Float> forFloat(String str, int i) {
            return new Field(3, false, 3, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Float>, ArrayList<Float>> forFloats(String str) {
            return new Field(3, true, 3, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Float>, ArrayList<Float>> forFloats(String str, int i) {
            return new Field(3, true, 3, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Integer, Integer> forInteger(String str) {
            return new Field(0, false, 0, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Integer, Integer> forInteger(String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Integer>, ArrayList<Integer>> forIntegers(String str) {
            return new Field(0, true, 0, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Integer>, ArrayList<Integer>> forIntegers(String str, int i) {
            return new Field(0, true, 0, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Long, Long> forLong(String str) {
            return new Field(2, false, 2, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<Long, Long> forLong(String str, int i) {
            return new Field(2, false, 2, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Long>, ArrayList<Long>> forLongs(String str) {
            return new Field(2, true, 2, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<Long>, ArrayList<Long>> forLongs(String str, int i) {
            return new Field(2, true, 2, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<String, String> forString(String str) {
            return new Field(7, false, 7, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<String, String> forString(String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str) {
            return new Field(10, false, 10, false, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(String str, int i) {
            return new Field(10, false, 10, false, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str) {
            return new Field(7, true, 7, true, str, -1, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field<ArrayList<String>, ArrayList<String>> forStrings(String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class<? extends FastJsonResponse>) null, (FieldConverter) null);
        }

        public static Field withConverter(String str, int i, FieldConverter<?, ?> fieldConverter, boolean z) {
            return new Field(fieldConverter.getTypeIn(), z, fieldConverter.getTypeOut(), false, str, i, (Class<? extends FastJsonResponse>) null, fieldConverter);
        }

        public static <T extends FieldConverter> Field withConverter(String str, int i, Class<T> cls, boolean z) {
            try {
                return withConverter(str, i, (FieldConverter<?, ?>) (FieldConverter) cls.newInstance(), z);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public static Field withConverter(String str, FieldConverter<?, ?> fieldConverter, boolean z) {
            return withConverter(str, -1, fieldConverter, z);
        }

        public static <T extends FieldConverter> Field withConverter(String str, Class<T> cls, boolean z) {
            return withConverter(str, -1, cls, z);
        }

        private final String zzcz() {
            String str = this.mConcreteTypeName;
            if (str == null) {
                return null;
            }
            return str;
        }

        private final ConverterWrapper zzda() {
            FieldConverter<I, O> fieldConverter = this.zzwo;
            if (fieldConverter == null) {
                return null;
            }
            return ConverterWrapper.wrap(fieldConverter);
        }

        public O convert(I i) {
            return this.zzwo.convert(i);
        }

        public I convertBack(O o) {
            return this.zzwo.convertBack(o);
        }

        public Field<I, O> copyForDictionary() {
            return new Field(this.zzal, this.mTypeIn, this.mTypeInArray, this.mTypeOut, this.mTypeOutArray, this.mOutputFieldName, this.mSafeParcelableFieldId, this.mConcreteTypeName, zzda());
        }

        public Class<? extends FastJsonResponse> getConcreteType() {
            return this.mConcreteType;
        }

        public Map<String, Field<?, ?>> getConcreteTypeFieldMappingFromDictionary() {
            Preconditions.checkNotNull(this.mConcreteTypeName);
            Preconditions.checkNotNull(this.zzwn);
            return this.zzwn.getFieldMapping(this.mConcreteTypeName);
        }

        public String getOutputFieldName() {
            return this.mOutputFieldName;
        }

        public int getSafeParcelableFieldId() {
            return this.mSafeParcelableFieldId;
        }

        public int getTypeIn() {
            return this.mTypeIn;
        }

        public int getTypeOut() {
            return this.mTypeOut;
        }

        public int getVersionCode() {
            return this.zzal;
        }

        public boolean hasConverter() {
            return this.zzwo != null;
        }

        public boolean isTypeInArray() {
            return this.mTypeInArray;
        }

        public boolean isTypeOutArray() {
            return this.mTypeOutArray;
        }

        public boolean isValidSafeParcelableFieldId() {
            return this.mSafeParcelableFieldId != -1;
        }

        public FastJsonResponse newConcreteTypeInstance() {
            Class<? extends FastJsonResponse> cls = this.mConcreteType;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.zzwn, "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object.");
            return new SafeParcelResponse(this.zzwn, this.mConcreteTypeName);
        }

        public void setFieldMappingDictionary(FieldMappingDictionary fieldMappingDictionary) {
            this.zzwn = fieldMappingDictionary;
        }

        public String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add(AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE, Integer.valueOf(this.zzal)).add("typeIn", Integer.valueOf(this.mTypeIn)).add("typeInArray", Boolean.valueOf(this.mTypeInArray)).add("typeOut", Integer.valueOf(this.mTypeOut)).add("typeOutArray", Boolean.valueOf(this.mTypeOutArray)).add("outputFieldName", this.mOutputFieldName).add("safeParcelFieldId", Integer.valueOf(this.mSafeParcelableFieldId)).add("concreteTypeName", zzcz());
            Class<? extends FastJsonResponse> concreteType = getConcreteType();
            if (concreteType != null) {
                add.add("concreteType.class", concreteType.getCanonicalName());
            }
            FieldConverter<I, O> fieldConverter = this.zzwo;
            if (fieldConverter != null) {
                add.add("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
            SafeParcelWriter.writeInt(parcel, 2, getTypeIn());
            SafeParcelWriter.writeBoolean(parcel, 3, isTypeInArray());
            SafeParcelWriter.writeInt(parcel, 4, getTypeOut());
            SafeParcelWriter.writeBoolean(parcel, 5, isTypeOutArray());
            SafeParcelWriter.writeString(parcel, 6, getOutputFieldName(), false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zzcz(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zzda(), i, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    public interface FieldConverter<I, O> {
        O convert(I i);

        I convertBack(O o);

        int getTypeIn();

        int getTypeOut();
    }

    public interface FieldType {
        public static final int BASE64 = 8;
        public static final int BASE64_URL_SAFE = 9;
        public static final int BIG_DECIMAL = 5;
        public static final int BIG_INTEGER = 1;
        public static final int BOOLEAN = 6;
        public static final int CONCRETE_TYPE = 11;
        public static final int DOUBLE = 4;
        public static final int FLOAT = 3;
        public static final int INT = 0;
        public static final int LONG = 2;
        public static final int STRING = 7;
        public static final int STRING_MAP = 10;
    }

    public static InputStream getUnzippedStream(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        if (IOUtils.isGzipByteBuffer(bArr)) {
            try {
                return new GZIPInputStream(byteArrayInputStream);
            } catch (IOException unused) {
            }
        }
        return byteArrayInputStream;
    }

    private final <I, O> void zza(Field<I, O> field, I i) {
        String outputFieldName = field.getOutputFieldName();
        O convert = field.convert(i);
        switch (field.getTypeOut()) {
            case 0:
                if (zzb(outputFieldName, convert)) {
                    setIntegerInternal(field, outputFieldName, ((Integer) convert).intValue());
                    return;
                }
                return;
            case 1:
                setBigIntegerInternal(field, outputFieldName, (BigInteger) convert);
                return;
            case 2:
                if (zzb(outputFieldName, convert)) {
                    setLongInternal(field, outputFieldName, ((Long) convert).longValue());
                    return;
                }
                return;
            case 4:
                if (zzb(outputFieldName, convert)) {
                    setDoubleInternal(field, outputFieldName, ((Double) convert).doubleValue());
                    return;
                }
                return;
            case 5:
                setBigDecimalInternal(field, outputFieldName, (BigDecimal) convert);
                return;
            case 6:
                if (zzb(outputFieldName, convert)) {
                    setBooleanInternal(field, outputFieldName, ((Boolean) convert).booleanValue());
                    return;
                }
                return;
            case 7:
                setStringInternal(field, outputFieldName, (String) convert);
                return;
            case 8:
            case 9:
                if (zzb(outputFieldName, convert)) {
                    setDecodedBytesInternal(field, outputFieldName, (byte[]) convert);
                    return;
                }
                return;
            default:
                int typeOut = field.getTypeOut();
                StringBuilder sb = new StringBuilder(44);
                sb.append("Unsupported type for conversion: ");
                sb.append(typeOut);
                throw new IllegalStateException(sb.toString());
        }
    }

    private static void zza(StringBuilder sb, Field field, Object obj) {
        String str;
        if (field.getTypeIn() == 11) {
            str = ((FastJsonResponse) field.getConcreteType().cast(obj)).toString();
        } else if (field.getTypeIn() == 7) {
            str = QUOTE;
            sb.append(str);
            sb.append(JsonUtils.escapeString((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(str);
    }

    private static <O> boolean zzb(String str, O o) {
        if (o != null) {
            return true;
        }
        if (!Log.isLoggable("FastJsonResponse", 6)) {
            return false;
        }
        new StringBuilder(String.valueOf(str).length() + 58);
        return false;
    }

    public <T extends FastJsonResponse> void addConcreteType(String str, T t) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeArray(String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        addConcreteTypeArray(str, arrayList);
    }

    public <T extends FastJsonResponse> void addConcreteTypeInternal(Field<?, ?> field, String str, T t) {
        addConcreteType(str, t);
    }

    public HashMap<String, Object> getConcreteTypeArrays() {
        return null;
    }

    public HashMap<String, Object> getConcreteTypes() {
        return null;
    }

    public abstract Map<String, Field<?, ?>> getFieldMappings();

    public Object getFieldValue(Field field) {
        String outputFieldName = field.getOutputFieldName();
        if (field.getConcreteType() == null) {
            return getValueObject(field.getOutputFieldName());
        }
        Preconditions.checkState(getValueObject(field.getOutputFieldName()) == null, "Concrete field shouldn't be value object: %s", field.getOutputFieldName());
        HashMap<String, Object> concreteTypeArrays = field.isTypeOutArray() ? getConcreteTypeArrays() : getConcreteTypes();
        if (concreteTypeArrays != null) {
            return concreteTypeArrays.get(outputFieldName);
        }
        try {
            char upperCase = Character.toUpperCase(outputFieldName.charAt(0));
            String substring = outputFieldName.substring(1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 4);
            sb.append("get");
            sb.append(upperCase);
            sb.append(substring);
            return getClass().getMethod(sb.toString(), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <O, I> I getOriginalValue(Field<I, O> field, Object obj) {
        return field.zzwo != null ? field.convertBack(obj) : obj;
    }

    public PostProcessor<? extends FastJsonResponse> getPostProcessor() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[SYNTHETIC, Splitter:B:22:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[SYNTHETIC, Splitter:B:27:0x0045] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getResponseBody() {
        /*
            r8 = this;
            boolean r0 = r8.zzwm
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            r0 = 0
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x003b }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x003b }
            byte[] r3 = r8.zzwl     // Catch:{ IOException -> 0x003b }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x003b }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            r3.<init>()     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
        L_0x001b:
            r4 = 0
            int r5 = r1.read(r2, r4, r0)     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            r6 = -1
            if (r5 == r6) goto L_0x0027
            r3.write(r2, r4, r5)     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            goto L_0x001b
        L_0x0027:
            r3.flush()     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0034, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            goto L_0x0043
        L_0x0034:
            r0 = r1
            goto L_0x003b
        L_0x0036:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x0043
        L_0x003b:
            byte[] r1 = r8.zzwl     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r1
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.getResponseBody():byte[]");
    }

    public int getResponseCode() {
        Preconditions.checkState(this.zzwm);
        return this.zzwk;
    }

    public abstract Object getValueObject(String str);

    public boolean isConcreteTypeArrayFieldSet(String str) {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public boolean isConcreteTypeFieldSet(String str) {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public boolean isFieldSet(Field field) {
        if (field.getTypeOut() != 11) {
            return isPrimitiveFieldSet(field.getOutputFieldName());
        }
        boolean isTypeOutArray = field.isTypeOutArray();
        String outputFieldName = field.getOutputFieldName();
        return isTypeOutArray ? isConcreteTypeArrayFieldSet(outputFieldName) : isConcreteTypeFieldSet(outputFieldName);
    }

    public abstract boolean isPrimitiveFieldSet(String str);

    public <T extends FastJsonResponse> void parseNetworkResponse(int i, byte[] bArr) {
        this.zzwk = i;
        this.zzwl = bArr;
        this.zzwm = true;
        InputStream unzippedStream = getUnzippedStream(bArr);
        try {
            new FastParser().parse(unzippedStream, this);
        } finally {
            try {
                unzippedStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final <O> void setBigDecimal(Field<BigDecimal, O> field, BigDecimal bigDecimal) {
        if (field.zzwo != null) {
            zza(field, bigDecimal);
        } else {
            setBigDecimalInternal(field, field.getOutputFieldName(), bigDecimal);
        }
    }

    public void setBigDecimal(String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public void setBigDecimalInternal(Field<?, ?> field, String str, BigDecimal bigDecimal) {
        setBigDecimal(str, bigDecimal);
    }

    public final <O> void setBigDecimals(Field<ArrayList<BigDecimal>, O> field, ArrayList<BigDecimal> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setBigDecimalsInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setBigDecimals(String str, ArrayList<BigDecimal> arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public void setBigDecimalsInternal(Field<?, ?> field, String str, ArrayList<BigDecimal> arrayList) {
        setBigDecimals(str, arrayList);
    }

    public final <O> void setBigInteger(Field<BigInteger, O> field, BigInteger bigInteger) {
        if (field.zzwo != null) {
            zza(field, bigInteger);
        } else {
            setBigIntegerInternal(field, field.getOutputFieldName(), bigInteger);
        }
    }

    public void setBigInteger(String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public void setBigIntegerInternal(Field<?, ?> field, String str, BigInteger bigInteger) {
        setBigInteger(str, bigInteger);
    }

    public final <O> void setBigIntegers(Field<ArrayList<BigInteger>, O> field, ArrayList<BigInteger> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setBigIntegersInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setBigIntegers(String str, ArrayList<BigInteger> arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public void setBigIntegersInternal(Field<?, ?> field, String str, ArrayList<BigInteger> arrayList) {
        setBigIntegers(str, arrayList);
    }

    public final <O> void setBoolean(Field<Boolean, O> field, boolean z) {
        if (field.zzwo != null) {
            zza(field, Boolean.valueOf(z));
        } else {
            setBooleanInternal(field, field.getOutputFieldName(), z);
        }
    }

    public void setBoolean(String str, boolean z) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    public void setBooleanInternal(Field<?, ?> field, String str, boolean z) {
        setBoolean(str, z);
    }

    public final <O> void setBooleans(Field<ArrayList<Boolean>, O> field, ArrayList<Boolean> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setBooleansInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setBooleans(String str, ArrayList<Boolean> arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public void setBooleansInternal(Field<?, ?> field, String str, ArrayList<Boolean> arrayList) {
        setBooleans(str, arrayList);
    }

    public final <O> void setDecodedBytes(Field<byte[], O> field, byte[] bArr) {
        if (field.zzwo != null) {
            zza(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.getOutputFieldName(), bArr);
        }
    }

    public void setDecodedBytes(String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    public void setDecodedBytesInternal(Field<?, ?> field, String str, byte[] bArr) {
        setDecodedBytes(str, bArr);
    }

    public final <O> void setDouble(Field<Double, O> field, double d) {
        if (field.zzwo != null) {
            zza(field, Double.valueOf(d));
        } else {
            setDoubleInternal(field, field.getOutputFieldName(), d);
        }
    }

    public void setDouble(String str, double d) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public void setDoubleInternal(Field<?, ?> field, String str, double d) {
        setDouble(str, d);
    }

    public final <O> void setDoubles(Field<ArrayList<Double>, O> field, ArrayList<Double> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setDoublesInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setDoubles(String str, ArrayList<Double> arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public void setDoublesInternal(Field<?, ?> field, String str, ArrayList<Double> arrayList) {
        setDoubles(str, arrayList);
    }

    public final <O> void setFloat(Field<Float, O> field, float f) {
        if (field.zzwo != null) {
            zza(field, Float.valueOf(f));
        } else {
            setFloatInternal(field, field.getOutputFieldName(), f);
        }
    }

    public void setFloat(String str, float f) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public void setFloatInternal(Field<?, ?> field, String str, float f) {
        setFloat(str, f);
    }

    public final <O> void setFloats(Field<ArrayList<Float>, O> field, ArrayList<Float> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setFloatsInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setFloats(String str, ArrayList<Float> arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public void setFloatsInternal(Field<?, ?> field, String str, ArrayList<Float> arrayList) {
        setFloats(str, arrayList);
    }

    public final <O> void setInteger(Field<Integer, O> field, int i) {
        if (field.zzwo != null) {
            zza(field, Integer.valueOf(i));
        } else {
            setIntegerInternal(field, field.getOutputFieldName(), i);
        }
    }

    public void setInteger(String str, int i) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    public void setIntegerInternal(Field<?, ?> field, String str, int i) {
        setInteger(str, i);
    }

    public final <O> void setIntegers(Field<ArrayList<Integer>, O> field, ArrayList<Integer> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setIntegersInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setIntegers(String str, ArrayList<Integer> arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public void setIntegersInternal(Field<?, ?> field, String str, ArrayList<Integer> arrayList) {
        setIntegers(str, arrayList);
    }

    public final <O> void setLong(Field<Long, O> field, long j) {
        if (field.zzwo != null) {
            zza(field, Long.valueOf(j));
        } else {
            setLongInternal(field, field.getOutputFieldName(), j);
        }
    }

    public void setLong(String str, long j) {
        throw new UnsupportedOperationException("Long not supported");
    }

    public void setLongInternal(Field<?, ?> field, String str, long j) {
        setLong(str, j);
    }

    public final <O> void setLongs(Field<ArrayList<Long>, O> field, ArrayList<Long> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setLongsInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setLongs(String str, ArrayList<Long> arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }

    public void setLongsInternal(Field<?, ?> field, String str, ArrayList<Long> arrayList) {
        setLongs(str, arrayList);
    }

    public final <O> void setString(Field<String, O> field, String str) {
        if (field.zzwo != null) {
            zza(field, str);
        } else {
            setStringInternal(field, field.getOutputFieldName(), str);
        }
    }

    public void setString(String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    public void setStringInternal(Field<?, ?> field, String str, String str2) {
        setString(str, str2);
    }

    public final <O> void setStringMap(Field<Map<String, String>, O> field, Map<String, String> map) {
        if (field.zzwo != null) {
            zza(field, map);
        } else {
            setStringMapInternal(field, field.getOutputFieldName(), map);
        }
    }

    public void setStringMap(String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    public void setStringMapInternal(Field<?, ?> field, String str, Map<String, String> map) {
        setStringMap(str, map);
    }

    public final <O> void setStrings(Field<ArrayList<String>, O> field, ArrayList<String> arrayList) {
        if (field.zzwo != null) {
            zza(field, arrayList);
        } else {
            setStringsInternal(field, field.getOutputFieldName(), arrayList);
        }
    }

    public void setStrings(String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public void setStringsInternal(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        setStrings(str, arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008d, code lost:
        r1.append(r3);
        r1.append(QUOTE);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r0 = r9.getFieldMappings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.isFieldSet(r4)
            if (r5 == 0) goto L_0x0013
            java.lang.Object r5 = r9.getFieldValue(r4)
            java.lang.Object r5 = r9.getOriginalValue(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L_0x0042
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L_0x0045
        L_0x0042:
            r1.append(r7)
        L_0x0045:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L_0x005a
            java.lang.String r3 = "null"
        L_0x0056:
            r1.append(r3)
            goto L_0x0013
        L_0x005a:
            int r3 = r4.getTypeOut()
            switch(r3) {
                case 8: goto L_0x0084;
                case 9: goto L_0x007a;
                case 10: goto L_0x0074;
                default: goto L_0x0061;
            }
        L_0x0061:
            boolean r3 = r4.isTypeInArray()
            if (r3 == 0) goto L_0x00aa
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            r3 = 0
            int r6 = r5.size()
            goto L_0x0094
        L_0x0074:
            java.util.HashMap r5 = (java.util.HashMap) r5
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r5)
            goto L_0x0013
        L_0x007a:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r5)
            goto L_0x008d
        L_0x0084:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r5)
        L_0x008d:
            r1.append(r3)
            r1.append(r6)
            goto L_0x0013
        L_0x0094:
            if (r3 >= r6) goto L_0x00a7
            if (r3 <= 0) goto L_0x009b
            r1.append(r7)
        L_0x009b:
            java.lang.Object r8 = r5.get(r3)
            if (r8 == 0) goto L_0x00a4
            zza(r1, r4, r8)
        L_0x00a4:
            int r3 = r3 + 1
            goto L_0x0094
        L_0x00a7:
            java.lang.String r3 = "]"
            goto L_0x0056
        L_0x00aa:
            zza(r1, r4, r5)
            goto L_0x0013
        L_0x00af:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00b9
            java.lang.String r0 = "}"
            goto L_0x00bc
        L_0x00b9:
            java.lang.String r0 = "{}"
        L_0x00bc:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastJsonResponse.toString():java.lang.String");
    }
}
