package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public class FastParser<T extends FastJsonResponse> {
    private static final char[] zzwv = {'u', 'l', 'l'};
    private static final char[] zzww = {'r', 'u', 'e'};
    private static final char[] zzwx = {'r', 'u', 'e', '\"'};
    private static final char[] zzwy = {'a', 'l', 's', 'e'};
    private static final char[] zzwz = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zzxa = {10};
    private static final zza<Integer> zzxc = new zza();
    private static final zza<Long> zzxd = new zzb();
    private static final zza<Float> zzxe = new zzc();
    private static final zza<Double> zzxf = new zzd();
    private static final zza<Boolean> zzxg = new zze();
    private static final zza<String> zzxh = new zzf();
    private static final zza<BigInteger> zzxi = new zzg();
    private static final zza<BigDecimal> zzxj = new zzh();
    private final char[] zzwq = new char[1];
    private final char[] zzwr = new char[32];
    private final char[] zzws = new char[1024];
    private final StringBuilder zzwt = new StringBuilder(32);
    private final StringBuilder zzwu = new StringBuilder(1024);
    private final Stack<Integer> zzxb = new Stack<>();

    public static class ParseException extends Exception {
        public ParseException(String str) {
            super(str);
        }

        public ParseException(String str, Throwable th) {
            super(str, th);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }

    public interface zza<O> {
        O zzh(FastParser fastParser, BufferedReader bufferedReader);
    }

    private final int zza(BufferedReader bufferedReader, char[] cArr) {
        int i;
        char zzj = zzj(bufferedReader);
        if (zzj == 0) {
            throw new ParseException("Unexpected EOF");
        } else if (zzj == ',') {
            throw new ParseException("Missing value");
        } else if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return 0;
        } else {
            bufferedReader.mark(1024);
            if (zzj == '\"') {
                i = 0;
                boolean z = false;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        throw new ParseException("Unexpected control character while reading string");
                    } else if (c != '\"' || z) {
                        z = c == '\\' ? !z : false;
                        i++;
                    } else {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i + 1));
                        return i;
                    }
                }
            } else {
                cArr[0] = zzj;
                int i2 = 1;
                while (i < cArr.length && bufferedReader.read(cArr, i, 1) != -1) {
                    char c2 = cArr[i];
                    if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == cArr.length) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException("Unexpected EOF");
        }
    }

    private final String zza(BufferedReader bufferedReader) {
        this.zzxb.push(2);
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            this.zzxb.push(3);
            String zzb = zzb(bufferedReader, this.zzwr, this.zzwt, (char[]) null);
            zzk(3);
            if (zzj(bufferedReader) == ':') {
                return zzb;
            }
            throw new ParseException("Expected key/value separator");
        } else if (zzj == ']') {
            zzk(2);
            zzk(1);
            zzk(5);
            return null;
        } else if (zzj == '}') {
            zzk(2);
            return null;
        } else {
            StringBuilder sb = new StringBuilder(19);
            sb.append("Unexpected token: ");
            sb.append(zzj);
            throw new ParseException(sb.toString());
        }
    }

    private final String zza(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) {
        char zzj = zzj(bufferedReader);
        if (zzj == '\"') {
            return zzb(bufferedReader, cArr, sb, cArr2);
        }
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return null;
        }
        throw new ParseException("Expected string");
    }

    private final <T extends FastJsonResponse> ArrayList<T> zza(BufferedReader bufferedReader, FastJsonResponse.Field<?, ?> field) {
        ArrayList<T> arrayList = new ArrayList<>();
        char zzj = zzj(bufferedReader);
        if (zzj == ']') {
            zzk(5);
            return arrayList;
        } else if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            zzk(5);
            return null;
        } else if (zzj == '{') {
            Stack<Integer> stack = this.zzxb;
            while (true) {
                stack.push(1);
                try {
                    FastJsonResponse newConcreteTypeInstance = field.newConcreteTypeInstance();
                    if (!zza(bufferedReader, newConcreteTypeInstance)) {
                        return arrayList;
                    }
                    arrayList.add(newConcreteTypeInstance);
                    char zzj2 = zzj(bufferedReader);
                    if (zzj2 != ',') {
                        if (zzj2 == ']') {
                            zzk(5);
                            return arrayList;
                        }
                        StringBuilder sb = new StringBuilder(19);
                        sb.append("Unexpected token: ");
                        sb.append(zzj2);
                        throw new ParseException(sb.toString());
                    } else if (zzj(bufferedReader) == '{') {
                        stack = this.zzxb;
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            StringBuilder sb4 = new StringBuilder(19);
            sb4.append("Unexpected token: ");
            sb4.append(zzj);
            throw new ParseException(sb4.toString());
        }
    }

    private final <O> ArrayList<O> zza(BufferedReader bufferedReader, zza<O> zza2) {
        char zzj = zzj(bufferedReader);
        if (zzj == 'n') {
            zzb(bufferedReader, zzwv);
            return null;
        } else if (zzj == '[') {
            this.zzxb.push(5);
            ArrayList<O> arrayList = new ArrayList<>();
            while (true) {
                bufferedReader.mark(1024);
                char zzj2 = zzj(bufferedReader);
                if (zzj2 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (zzj2 != ',') {
                    if (zzj2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(zza2.zzh(this, bufferedReader));
                    } else {
                        zzk(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028b, code lost:
        r5 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028c, code lost:
        zzk(r5);
        zzk(2);
        r5 = zzj(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0297, code lost:
        if (r5 == ',') goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0299, code lost:
        if (r5 != '}') goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x029b, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x029e, code lost:
        r3 = new java.lang.StringBuilder(55);
        r3.append("Expected end of object or field separator, but found: ");
        r3.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b6, code lost:
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b7, code lost:
        r5 = zza(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c4, code lost:
        r5 = 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(java.io.BufferedReader r17, com.google.android.gms.common.server.response.FastJsonResponse r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            java.lang.String r3 = "Error instantiating inner object"
            java.util.Map r4 = r18.getFieldMappings()
            java.lang.String r5 = r16.zza(r17)
            r6 = 0
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            if (r5 != 0) goto L_0x001c
            r1.zzk(r7)
            return r6
        L_0x001c:
            r9 = 0
        L_0x001d:
            if (r5 == 0) goto L_0x02bd
            java.lang.Object r5 = r4.get(r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = r16.zzb(r17)
            goto L_0x001d
        L_0x002c:
            java.util.Stack<java.lang.Integer> r10 = r1.zzxb
            r11 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.push(r12)
            int r10 = r5.getTypeIn()
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 44
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 110(0x6e, float:1.54E-43)
            switch(r10) {
                case 0: goto L_0x0274;
                case 1: goto L_0x025c;
                case 2: goto L_0x0244;
                case 3: goto L_0x022c;
                case 4: goto L_0x0214;
                case 5: goto L_0x01fa;
                case 6: goto L_0x01e0;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01b3;
                case 9: goto L_0x01a1;
                case 10: goto L_0x00e0;
                case 11: goto L_0x0062;
                default: goto L_0x0045;
            }
        L_0x0045:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            int r2 = r5.getTypeIn()
            r3 = 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid field type "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0062:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x009f
            char r10 = r16.zzj(r17)
            if (r10 != r15) goto L_0x007c
            char[] r10 = zzwv
            r1.zzb((java.io.BufferedReader) r0, (char[]) r10)
            java.lang.String r10 = r5.getOutputFieldName()
            r2.addConcreteTypeArrayInternal(r5, r10, r9)
            goto L_0x028b
        L_0x007c:
            java.util.Stack<java.lang.Integer> r12 = r1.zzxb
            r15 = 5
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r12.push(r15)
            r12 = 91
            if (r10 != r12) goto L_0x0097
            java.lang.String r10 = r5.getOutputFieldName()
            java.util.ArrayList r12 = r1.zza((java.io.BufferedReader) r0, (com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>) r5)
            r2.addConcreteTypeArrayInternal(r5, r10, r12)
            goto L_0x028b
        L_0x0097:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected array start"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x009f:
            char r10 = r16.zzj(r17)
            if (r10 != r15) goto L_0x00b3
            char[] r10 = zzwv
            r1.zzb((java.io.BufferedReader) r0, (char[]) r10)
            java.lang.String r10 = r5.getOutputFieldName()
            r2.addConcreteTypeInternal(r5, r10, r9)
            goto L_0x028b
        L_0x00b3:
            java.util.Stack<java.lang.Integer> r15 = r1.zzxb
            r15.push(r8)
            if (r10 != r12) goto L_0x00d8
            com.google.android.gms.common.server.response.FastJsonResponse r10 = r5.newConcreteTypeInstance()     // Catch:{ InstantiationException -> 0x00d1, IllegalAccessException -> 0x00ca }
            r1.zza((java.io.BufferedReader) r0, (com.google.android.gms.common.server.response.FastJsonResponse) r10)     // Catch:{ InstantiationException -> 0x00d1, IllegalAccessException -> 0x00ca }
            java.lang.String r12 = r5.getOutputFieldName()     // Catch:{ InstantiationException -> 0x00d1, IllegalAccessException -> 0x00ca }
            r2.addConcreteTypeInternal(r5, r12, r10)     // Catch:{ InstantiationException -> 0x00d1, IllegalAccessException -> 0x00ca }
            goto L_0x028b
        L_0x00ca:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00d1:
            r0 = move-exception
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        L_0x00d8:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of object"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00e0:
            char r10 = r16.zzj(r17)
            if (r10 != r15) goto L_0x00ee
            char[] r10 = zzwv
            r1.zzb((java.io.BufferedReader) r0, (char[]) r10)
            r10 = r9
            goto L_0x0170
        L_0x00ee:
            if (r10 != r12) goto L_0x0199
            java.util.Stack<java.lang.Integer> r10 = r1.zzxb
            r10.push(r8)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L_0x00fa:
            char r12 = r16.zzj(r17)
            if (r12 == 0) goto L_0x0191
            r15 = 34
            if (r12 == r15) goto L_0x010c
            if (r12 == r14) goto L_0x0108
            goto L_0x018d
        L_0x0108:
            r1.zzk(r7)
            goto L_0x0170
        L_0x010c:
            char[] r12 = r1.zzwr
            java.lang.StringBuilder r11 = r1.zzwt
            java.lang.String r11 = zzb(r0, r12, r11, r9)
            char r12 = r16.zzj(r17)
            r6 = 58
            if (r12 == r6) goto L_0x0139
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No map value found for key "
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x012f
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0135
        L_0x012f:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x0135:
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0139:
            char r6 = r16.zzj(r17)
            if (r6 == r15) goto L_0x015c
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected String value for key "
            java.lang.String r3 = java.lang.String.valueOf(r11)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0152
            java.lang.String r2 = r2.concat(r3)
            goto L_0x0158
        L_0x0152:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            r2 = r3
        L_0x0158:
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x015c:
            char[] r6 = r1.zzwr
            java.lang.StringBuilder r12 = r1.zzwt
            java.lang.String r6 = zzb(r0, r6, r12, r9)
            r10.put(r11, r6)
            char r6 = r16.zzj(r17)
            if (r6 == r13) goto L_0x018d
            if (r6 != r14) goto L_0x0174
            goto L_0x0108
        L_0x0170:
            r2.setStringMap(r5, (java.util.Map<java.lang.String, java.lang.String>) r10)
            goto L_0x01c4
        L_0x0174:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected character while parsing string map: "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x018d:
            r6 = 0
            r11 = 4
            goto L_0x00fa
        L_0x0191:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x0199:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of a map object"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x01a1:
            char[] r6 = r1.zzws
            java.lang.StringBuilder r10 = r1.zzwu
            char[] r11 = zzxa
            java.lang.String r6 = r1.zza(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r6)
            r2.setDecodedBytes(r5, (byte[]) r6)
            goto L_0x01c4
        L_0x01b3:
            char[] r6 = r1.zzws
            java.lang.StringBuilder r10 = r1.zzwu
            char[] r11 = zzxa
            java.lang.String r6 = r1.zza(r0, r6, r10, r11)
            byte[] r6 = com.google.android.gms.common.util.Base64Utils.decode(r6)
            r2.setDecodedBytes(r5, (byte[]) r6)
        L_0x01c4:
            r5 = 4
            r6 = 0
            goto L_0x028c
        L_0x01c8:
            boolean r6 = r5.isTypeInArray()
            if (r6 == 0) goto L_0x01d8
            com.google.android.gms.common.server.response.FastParser$zza<java.lang.String> r6 = zzxh
            java.util.ArrayList r6 = r1.zza((java.io.BufferedReader) r0, r6)
            r2.setStrings(r5, (java.util.ArrayList<java.lang.String>) r6)
            goto L_0x01c4
        L_0x01d8:
            java.lang.String r6 = r16.zzc(r17)
            r2.setString(r5, (java.lang.String) r6)
            goto L_0x01c4
        L_0x01e0:
            boolean r6 = r5.isTypeInArray()
            if (r6 == 0) goto L_0x01f0
            com.google.android.gms.common.server.response.FastParser$zza<java.lang.Boolean> r6 = zzxg
            java.util.ArrayList r6 = r1.zza((java.io.BufferedReader) r0, r6)
            r2.setBooleans(r5, (java.util.ArrayList<java.lang.Boolean>) r6)
            goto L_0x01c4
        L_0x01f0:
            r6 = 0
            boolean r10 = r1.zza((java.io.BufferedReader) r0, (boolean) r6)
            r2.setBoolean(r5, (boolean) r10)
            goto L_0x028b
        L_0x01fa:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x020b
            com.google.android.gms.common.server.response.FastParser$zza<java.math.BigDecimal> r10 = zzxj
            java.util.ArrayList r10 = r1.zza((java.io.BufferedReader) r0, r10)
            r2.setBigDecimals(r5, (java.util.ArrayList<java.math.BigDecimal>) r10)
            goto L_0x028b
        L_0x020b:
            java.math.BigDecimal r10 = r16.zzi(r17)
            r2.setBigDecimal(r5, (java.math.BigDecimal) r10)
            goto L_0x028b
        L_0x0214:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x0224
            com.google.android.gms.common.server.response.FastParser$zza<java.lang.Double> r10 = zzxf
            java.util.ArrayList r10 = r1.zza((java.io.BufferedReader) r0, r10)
            r2.setDoubles(r5, (java.util.ArrayList<java.lang.Double>) r10)
            goto L_0x028b
        L_0x0224:
            double r10 = r16.zzh(r17)
            r2.setDouble(r5, (double) r10)
            goto L_0x028b
        L_0x022c:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x023c
            com.google.android.gms.common.server.response.FastParser$zza<java.lang.Float> r10 = zzxe
            java.util.ArrayList r10 = r1.zza((java.io.BufferedReader) r0, r10)
            r2.setFloats(r5, (java.util.ArrayList<java.lang.Float>) r10)
            goto L_0x028b
        L_0x023c:
            float r10 = r16.zzg(r17)
            r2.setFloat(r5, (float) r10)
            goto L_0x028b
        L_0x0244:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x0254
            com.google.android.gms.common.server.response.FastParser$zza<java.lang.Long> r10 = zzxd
            java.util.ArrayList r10 = r1.zza((java.io.BufferedReader) r0, r10)
            r2.setLongs(r5, (java.util.ArrayList<java.lang.Long>) r10)
            goto L_0x028b
        L_0x0254:
            long r10 = r16.zze(r17)
            r2.setLong(r5, (long) r10)
            goto L_0x028b
        L_0x025c:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x026c
            com.google.android.gms.common.server.response.FastParser$zza<java.math.BigInteger> r10 = zzxi
            java.util.ArrayList r10 = r1.zza((java.io.BufferedReader) r0, r10)
            r2.setBigIntegers(r5, (java.util.ArrayList<java.math.BigInteger>) r10)
            goto L_0x028b
        L_0x026c:
            java.math.BigInteger r10 = r16.zzf(r17)
            r2.setBigInteger(r5, (java.math.BigInteger) r10)
            goto L_0x028b
        L_0x0274:
            boolean r10 = r5.isTypeInArray()
            if (r10 == 0) goto L_0x0284
            com.google.android.gms.common.server.response.FastParser$zza<java.lang.Integer> r10 = zzxc
            java.util.ArrayList r10 = r1.zza((java.io.BufferedReader) r0, r10)
            r2.setIntegers(r5, (java.util.ArrayList<java.lang.Integer>) r10)
            goto L_0x028b
        L_0x0284:
            int r10 = r16.zzd(r17)
            r2.setInteger(r5, (int) r10)
        L_0x028b:
            r5 = 4
        L_0x028c:
            r1.zzk(r5)
            r5 = 2
            r1.zzk(r5)
            char r5 = r16.zzj(r17)
            if (r5 == r13) goto L_0x02b7
            if (r5 != r14) goto L_0x029e
            r5 = r9
            goto L_0x001d
        L_0x029e:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2 = 55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Expected end of object or field separator, but found: "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x02b7:
            java.lang.String r5 = r16.zza(r17)
            goto L_0x001d
        L_0x02bd:
            com.google.android.gms.common.server.response.PostProcessor r0 = r18.getPostProcessor()
            if (r0 == 0) goto L_0x02c6
            r0.postProcess(r2)
        L_0x02c6:
            r1.zzk(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zza(java.io.BufferedReader, com.google.android.gms.common.server.response.FastJsonResponse):boolean");
    }

    /* access modifiers changed from: private */
    public final boolean zza(BufferedReader bufferedReader, boolean z) {
        while (true) {
            char zzj = zzj(bufferedReader);
            if (zzj != '\"') {
                if (zzj == 'f') {
                    zzb(bufferedReader, z ? zzwz : zzwy);
                    return false;
                } else if (zzj == 'n') {
                    zzb(bufferedReader, zzwv);
                    return false;
                } else if (zzj == 't') {
                    zzb(bufferedReader, z ? zzwx : zzww);
                    return true;
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zzj);
                    throw new ParseException(sb.toString());
                }
            } else if (!z) {
                z = true;
            } else {
                throw new ParseException("No boolean value found in string");
            }
        }
    }

    private final String zzb(BufferedReader bufferedReader) {
        BufferedReader bufferedReader2 = bufferedReader;
        bufferedReader2.mark(1024);
        char zzj = zzj(bufferedReader);
        if (zzj != '\"') {
            if (zzj != ',') {
                int i = 1;
                if (zzj == '[') {
                    this.zzxb.push(5);
                    bufferedReader2.mark(32);
                    if (zzj(bufferedReader) != ']') {
                        bufferedReader.reset();
                        boolean z = false;
                        boolean z2 = false;
                        while (i > 0) {
                            char zzj2 = zzj(bufferedReader);
                            if (zzj2 == 0) {
                                throw new ParseException("Unexpected EOF while parsing array");
                            } else if (!Character.isISOControl(zzj2)) {
                                if (zzj2 == '\"' && !z) {
                                    z2 = !z2;
                                }
                                if (zzj2 == '[' && !z2) {
                                    i++;
                                }
                                if (zzj2 == ']' && !z2) {
                                    i--;
                                }
                                z = (zzj2 != '\\' || !z2) ? false : !z;
                            } else {
                                throw new ParseException("Unexpected control character while reading array");
                            }
                        }
                    }
                    zzk(5);
                } else if (zzj != '{') {
                    bufferedReader.reset();
                    zza(bufferedReader2, this.zzws);
                } else {
                    this.zzxb.push(1);
                    bufferedReader2.mark(32);
                    char zzj3 = zzj(bufferedReader);
                    if (zzj3 != '}') {
                        if (zzj3 == '\"') {
                            bufferedReader.reset();
                            zza(bufferedReader);
                            do {
                            } while (zzb(bufferedReader) != null);
                        } else {
                            StringBuilder sb = new StringBuilder(18);
                            sb.append("Unexpected token ");
                            sb.append(zzj3);
                            throw new ParseException(sb.toString());
                        }
                    }
                    zzk(1);
                }
            } else {
                throw new ParseException("Missing value");
            }
        } else if (bufferedReader2.read(this.zzwq) != -1) {
            char c = this.zzwq[0];
            boolean z3 = false;
            do {
                if (c != '\"' || z3) {
                    z3 = c == '\\' ? !z3 : false;
                    if (bufferedReader2.read(this.zzwq) != -1) {
                        c = this.zzwq[0];
                    } else {
                        throw new ParseException("Unexpected EOF while parsing string");
                    }
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char zzj4 = zzj(bufferedReader);
        if (zzj4 == ',') {
            zzk(2);
            return zza(bufferedReader);
        } else if (zzj4 == '}') {
            zzk(2);
            return null;
        } else {
            StringBuilder sb4 = new StringBuilder(18);
            sb4.append("Unexpected token ");
            sb4.append(zzj4);
            throw new ParseException(sb4.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0030 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzb(java.io.BufferedReader r9, char[] r10, java.lang.StringBuilder r11, char[] r12) {
        /*
            r0 = 0
            r11.setLength(r0)
            int r1 = r10.length
            r9.mark(r1)
            r1 = 0
            r2 = 0
        L_0x000a:
            int r3 = r9.read(r10)
            r4 = -1
            if (r3 == r4) goto L_0x0068
            r4 = 0
        L_0x0012:
            if (r4 >= r3) goto L_0x0060
            char r5 = r10[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            r7 = 1
            if (r6 == 0) goto L_0x0038
            if (r12 == 0) goto L_0x002c
            r6 = 0
        L_0x0020:
            int r8 = r12.length
            if (r6 >= r8) goto L_0x002c
            char r8 = r12[r6]
            if (r8 != r5) goto L_0x0029
            r6 = 1
            goto L_0x002d
        L_0x0029:
            int r6 = r6 + 1
            goto L_0x0020
        L_0x002c:
            r6 = 0
        L_0x002d:
            if (r6 == 0) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected control character while reading string"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0038:
            r6 = 34
            if (r5 != r6) goto L_0x0054
            if (r1 != 0) goto L_0x0054
            r11.append(r10, r0, r4)
            r9.reset()
            int r4 = r4 + r7
            long r0 = (long) r4
            r9.skip(r0)
            java.lang.String r9 = r11.toString()
            if (r2 == 0) goto L_0x0053
            java.lang.String r9 = com.google.android.gms.common.util.JsonUtils.unescapeString(r9)
        L_0x0053:
            return r9
        L_0x0054:
            r6 = 92
            if (r5 != r6) goto L_0x005c
            r1 = r1 ^ 1
            r2 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0060:
            r11.append(r10, r0, r3)
            int r3 = r10.length
            r9.mark(r3)
            goto L_0x000a
        L_0x0068:
            com.google.android.gms.common.server.response.FastParser$ParseException r9 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r10 = "Unexpected EOF while parsing string"
            r9.<init>((java.lang.String) r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.FastParser.zzb(java.io.BufferedReader, char[], java.lang.StringBuilder, char[]):java.lang.String");
    }

    private final void zzb(BufferedReader bufferedReader, char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            int read = bufferedReader.read(this.zzwr, 0, cArr.length - i);
            if (read != -1) {
                int i2 = 0;
                while (i2 < read) {
                    if (cArr[i2 + i] == this.zzwr[i2]) {
                        i2++;
                    } else {
                        throw new ParseException("Unexpected character");
                    }
                }
                i += read;
            } else {
                throw new ParseException("Unexpected EOF");
            }
        }
    }

    /* access modifiers changed from: private */
    public final String zzc(BufferedReader bufferedReader) {
        return zza(bufferedReader, this.zzwr, this.zzwt, (char[]) null);
    }

    /* access modifiers changed from: private */
    public final int zzd(BufferedReader bufferedReader) {
        boolean z;
        int i;
        int i2;
        int zza2 = zza(bufferedReader, this.zzws);
        int i3 = 0;
        if (zza2 == 0) {
            return 0;
        }
        char[] cArr = this.zzws;
        if (zza2 > 0) {
            if (cArr[0] == '-') {
                i2 = Integer.MIN_VALUE;
                i = 1;
                z = true;
            } else {
                i2 = -2147483647;
                i = 0;
                z = false;
            }
            if (i < zza2) {
                int i4 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    int i5 = -digit;
                    i = i4;
                    i3 = i5;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            while (i < zza2) {
                int i6 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (i3 >= -214748364) {
                    int i7 = i3 * 10;
                    if (i7 >= i2 + digit2) {
                        i3 = i7 - digit2;
                        i = i6;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (!z) {
                return -i3;
            }
            if (i > 1) {
                return i3;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final long zze(BufferedReader bufferedReader) {
        long j;
        boolean z;
        int zza2 = zza(bufferedReader, this.zzws);
        long j2 = 0;
        if (zza2 == 0) {
            return 0;
        }
        char[] cArr = this.zzws;
        if (zza2 > 0) {
            int i = 0;
            if (cArr[0] == '-') {
                j = Long.MIN_VALUE;
                i = 1;
                z = true;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            if (i < zza2) {
                int i2 = i + 1;
                int digit = Character.digit(cArr[i], 10);
                if (digit >= 0) {
                    i = i2;
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            }
            while (i < zza2) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    long j3 = j2 * 10;
                    long j4 = (long) digit2;
                    if (j3 >= j + j4) {
                        j2 = j3 - j4;
                        i = i3;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (!z) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* access modifiers changed from: private */
    public final BigInteger zzf(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return null;
        }
        return new BigInteger(new String(this.zzws, 0, zza2));
    }

    /* access modifiers changed from: private */
    public final float zzg(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zzws, 0, zza2));
    }

    /* access modifiers changed from: private */
    public final double zzh(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zzws, 0, zza2));
    }

    /* access modifiers changed from: private */
    public final BigDecimal zzi(BufferedReader bufferedReader) {
        int zza2 = zza(bufferedReader, this.zzws);
        if (zza2 == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zzws, 0, zza2));
    }

    private final char zzj(BufferedReader bufferedReader) {
        if (bufferedReader.read(this.zzwq) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.zzwq[0])) {
            if (bufferedReader.read(this.zzwq) == -1) {
                return 0;
            }
        }
        return this.zzwq[0];
    }

    private final void zzk(int i) {
        if (!this.zzxb.isEmpty()) {
            int intValue = this.zzxb.pop().intValue();
            if (intValue != i) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Expected state ");
                sb.append(i);
                sb.append(" but had ");
                sb.append(intValue);
                throw new ParseException(sb.toString());
            }
            return;
        }
        StringBuilder sb4 = new StringBuilder(46);
        sb4.append("Expected state ");
        sb4.append(i);
        sb4.append(" but had empty stack");
        throw new ParseException(sb4.toString());
    }

    public void parse(InputStream inputStream, T t) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.zzxb.push(0);
            char zzj = zzj(bufferedReader);
            if (zzj != 0) {
                if (zzj == '[') {
                    this.zzxb.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() == 1) {
                        FastJsonResponse.Field field = (FastJsonResponse.Field) fieldMappings.entrySet().iterator().next().getValue();
                        t.addConcreteTypeArrayInternal(field, field.getOutputFieldName(), zza(bufferedReader, (FastJsonResponse.Field<?, ?>) field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (zzj == '{') {
                    this.zzxb.push(1);
                    zza(bufferedReader, (FastJsonResponse) t);
                } else {
                    StringBuilder sb = new StringBuilder(19);
                    sb.append("Unexpected token: ");
                    sb.append(zzj);
                    throw new ParseException(sb.toString());
                }
                zzk(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } else {
                throw new ParseException("No data to parse");
            }
        } catch (IOException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public void parse(String str, T t) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            parse((InputStream) byteArrayInputStream, t);
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
