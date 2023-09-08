package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzeb extends zzjq {
    public zzeb(zzjr zzjr) {
        super(zzjr);
    }

    private final Boolean zza(double d, zzkg zzkg) {
        try {
            return zza(new BigDecimal(d), zzkg, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(long j, zzkg zzkg) {
        try {
            return zza(new BigDecimal(j), zzkg, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean zza(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private final Boolean zza(String str, int i, boolean z, String str2, List<String> list, String str3) {
        boolean startsWith;
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    zzge().zzip().zzg("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                startsWith = str.startsWith(str2);
                break;
            case 3:
                startsWith = str.endsWith(str2);
                break;
            case 4:
                startsWith = str.contains(str2);
                break;
            case 5:
                startsWith = str.equals(str2);
                break;
            case 6:
                startsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(startsWith);
    }

    private final Boolean zza(String str, zzkg zzkg) {
        if (!zzka.zzck(str)) {
            return null;
        }
        try {
            return zza(new BigDecimal(str), zzkg, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Boolean zza(String str, zzki zzki) {
        Integer num;
        ArrayList arrayList;
        Preconditions.checkNotNull(zzki);
        if (str == null || (num = zzki.zzash) == null || num.intValue() == 0) {
            return null;
        }
        if (zzki.zzash.intValue() == 6) {
            String[] strArr = zzki.zzask;
            if (strArr == null || strArr.length == 0) {
                return null;
            }
        } else if (zzki.zzasi == null) {
            return null;
        }
        int intValue = zzki.zzash.intValue();
        Boolean bool = zzki.zzasj;
        boolean z = bool != null && bool.booleanValue();
        String upperCase = (z || intValue == 1 || intValue == 6) ? zzki.zzasi : zzki.zzasi.toUpperCase(Locale.ENGLISH);
        String[] strArr2 = zzki.zzask;
        if (strArr2 == null) {
            arrayList = null;
        } else if (z) {
            arrayList = Arrays.asList(strArr2);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String upperCase2 : strArr2) {
                arrayList2.add(upperCase2.toUpperCase(Locale.ENGLISH));
            }
            arrayList = arrayList2;
        }
        return zza(str, intValue, z, upperCase, arrayList, intValue == 1 ? upperCase : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r3 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean zza(java.math.BigDecimal r10, com.google.android.gms.internal.measurement.zzkg r11, double r12) {
        /*
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            java.lang.Integer r0 = r11.zzarz
            r1 = 0
            if (r0 == 0) goto L_0x00f1
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0010
            goto L_0x00f1
        L_0x0010:
            java.lang.Integer r0 = r11.zzarz
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0022
            java.lang.String r0 = r11.zzasc
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r11.zzasd
            if (r0 != 0) goto L_0x0027
        L_0x0021:
            return r1
        L_0x0022:
            java.lang.String r0 = r11.zzasb
            if (r0 != 0) goto L_0x0027
            return r1
        L_0x0027:
            java.lang.Integer r0 = r11.zzarz
            int r0 = r0.intValue()
            java.lang.Integer r3 = r11.zzarz
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x0058
            java.lang.String r3 = r11.zzasc
            boolean r3 = com.google.android.gms.internal.measurement.zzka.zzck(r3)
            if (r3 == 0) goto L_0x0057
            java.lang.String r3 = r11.zzasd
            boolean r3 = com.google.android.gms.internal.measurement.zzka.zzck(r3)
            if (r3 != 0) goto L_0x0046
            goto L_0x0057
        L_0x0046:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0057 }
            java.lang.String r4 = r11.zzasc     // Catch:{ NumberFormatException -> 0x0057 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0057 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0057 }
            java.lang.String r11 = r11.zzasd     // Catch:{ NumberFormatException -> 0x0057 }
            r4.<init>(r11)     // Catch:{ NumberFormatException -> 0x0057 }
            r11 = r3
            r3 = r1
            goto L_0x006a
        L_0x0057:
            return r1
        L_0x0058:
            java.lang.String r3 = r11.zzasb
            boolean r3 = com.google.android.gms.internal.measurement.zzka.zzck(r3)
            if (r3 != 0) goto L_0x0061
            return r1
        L_0x0061:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00f1 }
            java.lang.String r11 = r11.zzasb     // Catch:{ NumberFormatException -> 0x00f1 }
            r3.<init>(r11)     // Catch:{ NumberFormatException -> 0x00f1 }
            r11 = r1
            r4 = r11
        L_0x006a:
            if (r0 != r2) goto L_0x006f
            if (r11 != 0) goto L_0x0071
            return r1
        L_0x006f:
            if (r3 == 0) goto L_0x00f1
        L_0x0071:
            r5 = -1
            r6 = 0
            r7 = 1
            if (r0 == r7) goto L_0x00e5
            r8 = 2
            if (r0 == r8) goto L_0x00d9
            r9 = 3
            if (r0 == r9) goto L_0x0091
            if (r0 == r2) goto L_0x007f
            goto L_0x00f1
        L_0x007f:
            int r11 = r10.compareTo(r11)
            if (r11 == r5) goto L_0x008c
            int r10 = r10.compareTo(r4)
            if (r10 == r7) goto L_0x008c
            r6 = 1
        L_0x008c:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x0091:
            r0 = 0
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x00cd
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r0)
            java.math.BigDecimal r11 = r3.subtract(r11)
            int r11 = r10.compareTo(r11)
            if (r11 != r7) goto L_0x00c8
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r12 = new java.math.BigDecimal
            r12.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r12)
            java.math.BigDecimal r11 = r3.add(r11)
            int r10 = r10.compareTo(r11)
            if (r10 != r5) goto L_0x00c8
            r6 = 1
        L_0x00c8:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00cd:
            int r10 = r10.compareTo(r3)
            if (r10 != 0) goto L_0x00d4
            r6 = 1
        L_0x00d4:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00d9:
            int r10 = r10.compareTo(r3)
            if (r10 != r7) goto L_0x00e0
            r6 = 1
        L_0x00e0:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00e5:
            int r10 = r10.compareTo(r3)
            if (r10 != r5) goto L_0x00ec
            r6 = 1
        L_0x00ec:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            return r10
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeb.zza(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzkg, double):java.lang.Boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v86, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05b9, code lost:
        r2.zzg(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x06ed, code lost:
        r7 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0706, code lost:
        r2.zze(r6, r3, r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x071f  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0722  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x072a  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0732  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0a22  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0a2d  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0a35  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x025e A[EDGE_INSN: B:350:0x025e->B:76:0x025e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzkm[] zza(java.lang.String r50, com.google.android.gms.internal.measurement.zzkn[] r51, com.google.android.gms.internal.measurement.zzks[] r52) {
        /*
            r49 = this;
            r1 = r49
            r15 = r50
            r14 = r51
            r13 = r52
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r50)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            u.b r12 = new u.b
            r12.<init>()
            u.b r9 = new u.b
            r9.<init>()
            u.b r10 = new u.b
            r10.<init>()
            com.google.android.gms.internal.measurement.zzei r0 = r49.zzix()
            java.util.Map r0 = r0.zzbf(r15)
            r7 = 0
            if (r0 == 0) goto L_0x00f1
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0032:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.zzkr r4 = (com.google.android.gms.internal.measurement.zzkr) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r9.getOrDefault(r5, r7)
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r10.getOrDefault(r6, r7)
            java.util.BitSet r6 = (java.util.BitSet) r6
            if (r5 != 0) goto L_0x007a
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r9.put(r6, r5)
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r10.put(r7, r6)
        L_0x007a:
            r7 = 0
        L_0x007b:
            long[] r8 = r4.zzauk
            r18 = r0
            int r0 = r8.length
            int r0 = r0 << 6
            if (r7 >= r0) goto L_0x00bf
            boolean r0 = com.google.android.gms.internal.measurement.zzka.zza((long[]) r8, (int) r7)
            if (r0 == 0) goto L_0x00b2
            com.google.android.gms.internal.measurement.zzfg r0 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r19 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r20 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r0.zze(r9, r8, r2)
            r6.set(r7)
            long[] r0 = r4.zzaul
            boolean r0 = com.google.android.gms.internal.measurement.zzka.zza((long[]) r0, (int) r7)
            if (r0 == 0) goto L_0x00b6
            r5.set(r7)
            goto L_0x00b6
        L_0x00b2:
            r19 = r2
            r20 = r9
        L_0x00b6:
            int r7 = r7 + 1
            r0 = r18
            r2 = r19
            r9 = r20
            goto L_0x007b
        L_0x00bf:
            r19 = r2
            r20 = r9
            com.google.android.gms.internal.measurement.zzkm r0 = new com.google.android.gms.internal.measurement.zzkm
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r12.put(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.zzasy = r2
            r0.zzasx = r4
            com.google.android.gms.internal.measurement.zzkr r2 = new com.google.android.gms.internal.measurement.zzkr
            r2.<init>()
            r0.zzasw = r2
            long[] r3 = com.google.android.gms.internal.measurement.zzka.zza((java.util.BitSet) r5)
            r2.zzaul = r3
            com.google.android.gms.internal.measurement.zzkr r0 = r0.zzasw
            long[] r2 = com.google.android.gms.internal.measurement.zzka.zza((java.util.BitSet) r6)
            r0.zzauk = r2
            r0 = r18
            r2 = r19
            r7 = 0
            goto L_0x0032
        L_0x00f1:
            r20 = r9
            java.lang.String r18 = "null"
            java.lang.String r9 = "Filter definition"
            java.lang.String r8 = "Skipping failed audience ID"
            if (r14 == 0) goto L_0x07c7
            u.b r6 = new u.b
            r6.<init>()
            int r4 = r14.length
            r21 = 0
            r0 = r1
            r2 = r15
            r24 = r21
            r3 = 0
            r19 = 0
            r23 = 0
        L_0x010c:
            if (r3 >= r4) goto L_0x07b6
            r26 = r8
            r8 = r14[r3]
            r27 = r0
            java.lang.String r0 = r8.name
            r28 = r9
            com.google.android.gms.internal.measurement.zzko[] r9 = r8.zzata
            com.google.android.gms.internal.measurement.zzef r5 = r49.zzgg()
            com.google.android.gms.internal.measurement.zzex<java.lang.Boolean> r7 = com.google.android.gms.internal.measurement.zzew.zzahv
            boolean r5 = r5.zzd(r2, r7)
            if (r5 == 0) goto L_0x0302
            r49.zzgb()
            java.lang.String r5 = "_eid"
            java.lang.Object r31 = com.google.android.gms.internal.measurement.zzka.zzb(r8, r5)
            r7 = r31
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x0138
            r31 = 1
            goto L_0x013a
        L_0x0138:
            r31 = 0
        L_0x013a:
            r33 = r3
            if (r31 == 0) goto L_0x0148
            java.lang.String r3 = "_ep"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0148
            r3 = 1
            goto L_0x0149
        L_0x0148:
            r3 = 0
        L_0x0149:
            if (r3 == 0) goto L_0x02b4
            r49.zzgb()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzka.zzb(r8, r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0175
            com.google.android.gms.internal.measurement.zzfg r0 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()
            java.lang.String r3 = "Extra parameter without an event name. eventId"
            r0.zzg(r3, r7)
            r15 = r2
            r32 = r4
            r38 = r6
            r34 = r10
            r17 = 0
            goto L_0x02a3
        L_0x0175:
            if (r19 == 0) goto L_0x018b
            if (r23 == 0) goto L_0x018b
            long r34 = r7.longValue()
            long r36 = r23.longValue()
            int r0 = (r34 > r36 ? 1 : (r34 == r36 ? 0 : -1))
            if (r0 == 0) goto L_0x0186
            goto L_0x018b
        L_0x0186:
            r31 = r3
            r5 = r19
            goto L_0x01be
        L_0x018b:
            com.google.android.gms.internal.measurement.zzei r0 = r49.zzix()
            android.util.Pair r0 = r0.zza((java.lang.String) r2, (java.lang.Long) r7)
            if (r0 == 0) goto L_0x028c
            r31 = r3
            java.lang.Object r3 = r0.first
            if (r3 != 0) goto L_0x01a8
            r15 = r2
            r32 = r4
            r38 = r6
            r34 = r10
            r10 = r31
            r17 = 0
            goto L_0x0296
        L_0x01a8:
            com.google.android.gms.internal.measurement.zzkn r3 = (com.google.android.gms.internal.measurement.zzkn) r3
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r24 = r0.longValue()
            r49.zzgb()
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzka.zzb(r3, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            r23 = r0
            r5 = r3
        L_0x01be:
            r34 = 1
            long r24 = r24 - r34
            int r0 = (r24 > r21 ? 1 : (r24 == r21 ? 0 : -1))
            if (r0 > 0) goto L_0x0212
            com.google.android.gms.internal.measurement.zzei r3 = r49.zzix()
            r3.zzab()
            com.google.android.gms.internal.measurement.zzfg r0 = r3.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzit()
            java.lang.String r7 = "Clearing complex main event info. appId"
            r0.zzg(r7, r2)
            android.database.sqlite.SQLiteDatabase r0 = r3.getWritableDatabase()     // Catch:{ SQLiteException -> 0x01f5 }
            java.lang.String r7 = "delete from main_event_params where app_id=?"
            r32 = r4
            r34 = r10
            r10 = 1
            java.lang.String[] r4 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x01f1 }
            r17 = 0
            r4[r17] = r2     // Catch:{ SQLiteException -> 0x01ef }
            r0.execSQL(r7, r4)     // Catch:{ SQLiteException -> 0x01ef }
            goto L_0x0209
        L_0x01ef:
            r0 = move-exception
            goto L_0x01fc
        L_0x01f1:
            r0 = move-exception
        L_0x01f2:
            r17 = 0
            goto L_0x01fc
        L_0x01f5:
            r0 = move-exception
            r32 = r4
            r34 = r10
            r10 = 1
            goto L_0x01f2
        L_0x01fc:
            com.google.android.gms.internal.measurement.zzfg r3 = r3.zzge()
            com.google.android.gms.internal.measurement.zzfi r3 = r3.zzim()
            java.lang.String r4 = "Error clearing complex main event"
            r3.zzg(r4, r0)
        L_0x0209:
            r15 = r2
            r3 = r5
            r38 = r6
            r10 = r31
            r16 = 1
            goto L_0x0235
        L_0x0212:
            r32 = r4
            r34 = r10
            r10 = 1
            r17 = 0
            com.google.android.gms.internal.measurement.zzei r0 = r49.zzix()
            r4 = r2
            r2 = r0
            r10 = r31
            r3 = r50
            r15 = r4
            r4 = r7
            r27 = r5
            r7 = r6
            r5 = r24
            r38 = r7
            r16 = 1
            r7 = r27
            r2.zza(r3, r4, r5, r7)
            r3 = r27
        L_0x0235:
            com.google.android.gms.internal.measurement.zzko[] r0 = r3.zzata
            int r2 = r0.length
            int r4 = r9.length
            int r2 = r2 + r4
            com.google.android.gms.internal.measurement.zzko[] r4 = new com.google.android.gms.internal.measurement.zzko[r2]
            int r5 = r0.length
            r6 = 0
            r7 = 0
        L_0x023f:
            r27 = r3
            if (r6 >= r5) goto L_0x025e
            r3 = r0[r6]
            r49.zzgb()
            r19 = r0
            java.lang.String r0 = r3.name
            com.google.android.gms.internal.measurement.zzko r0 = com.google.android.gms.internal.measurement.zzka.zza((com.google.android.gms.internal.measurement.zzkn) r8, (java.lang.String) r0)
            if (r0 != 0) goto L_0x0257
            int r0 = r7 + 1
            r4[r7] = r3
            r7 = r0
        L_0x0257:
            int r6 = r6 + 1
            r0 = r19
            r3 = r27
            goto L_0x023f
        L_0x025e:
            if (r7 <= 0) goto L_0x027a
            int r0 = r9.length
            r3 = 0
        L_0x0262:
            if (r3 >= r0) goto L_0x026e
            r5 = r9[r3]
            int r6 = r7 + 1
            r4[r7] = r5
            int r3 = r3 + 1
            r7 = r6
            goto L_0x0262
        L_0x026e:
            if (r7 != r2) goto L_0x0272
            r9 = r4
            goto L_0x0287
        L_0x0272:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r7)
            com.google.android.gms.internal.measurement.zzko[] r0 = (com.google.android.gms.internal.measurement.zzko[]) r0
            r9 = r0
            goto L_0x0287
        L_0x027a:
            com.google.android.gms.internal.measurement.zzfg r0 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzip()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.zzg(r2, r10)
        L_0x0287:
            r0 = r10
            r19 = r27
            goto L_0x030f
        L_0x028c:
            r15 = r2
            r32 = r4
            r38 = r6
            r34 = r10
            r17 = 0
            r10 = r3
        L_0x0296:
            com.google.android.gms.internal.measurement.zzfg r0 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.zze(r2, r10, r7)
        L_0x02a3:
            r8 = r1
            r9 = r11
            r48 = r12
            r2 = r15
            r43 = r20
            r42 = r26
            r0 = r27
            r45 = r28
            r1 = r34
            goto L_0x079d
        L_0x02b4:
            r15 = r2
            r32 = r4
            r38 = r6
            r34 = r10
            r16 = 1
            r17 = 0
            if (r31 == 0) goto L_0x030f
            r49.zzgb()
            java.lang.Long r2 = java.lang.Long.valueOf(r21)
            java.lang.String r3 = "_epc"
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzka.zzb(r8, r3)
            if (r3 != 0) goto L_0x02d1
            goto L_0x02d2
        L_0x02d1:
            r2 = r3
        L_0x02d2:
            java.lang.Long r2 = (java.lang.Long) r2
            long r23 = r2.longValue()
            int r2 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r2 > 0) goto L_0x02ec
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.zzg(r3, r0)
            r31 = r7
            goto L_0x02fb
        L_0x02ec:
            com.google.android.gms.internal.measurement.zzei r2 = r49.zzix()
            r3 = r50
            r4 = r7
            r5 = r23
            r31 = r7
            r7 = r8
            r2.zza(r3, r4, r5, r7)
        L_0x02fb:
            r19 = r8
            r24 = r23
            r23 = r31
            goto L_0x030f
        L_0x0302:
            r15 = r2
            r33 = r3
            r32 = r4
            r38 = r6
            r34 = r10
            r16 = 1
            r17 = 0
        L_0x030f:
            com.google.android.gms.internal.measurement.zzei r2 = r49.zzix()
            java.lang.String r3 = r8.name
            com.google.android.gms.internal.measurement.zzeq r2 = r2.zzf(r15, r3)
            if (r2 != 0) goto L_0x036e
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r50)
            com.google.android.gms.internal.measurement.zzfe r4 = r49.zzga()
            java.lang.String r4 = r4.zzbj(r0)
            java.lang.String r5 = "Event aggregate wasn't created during raw event logging. appId, event"
            r2.zze(r5, r3, r4)
            com.google.android.gms.internal.measurement.zzeq r27 = new com.google.android.gms.internal.measurement.zzeq
            java.lang.String r4 = r8.name
            r5 = 1
            r29 = 1
            java.lang.Long r2 = r8.zzatb
            long r35 = r2.longValue()
            r39 = 0
            r31 = 0
            r37 = 0
            r41 = 0
            r2 = r27
            r3 = r50
            r42 = r26
            r10 = 0
            r7 = r29
            r46 = r9
            r43 = r20
            r45 = r28
            r44 = r34
            r9 = r35
            r47 = r11
            r48 = r12
            r11 = r39
            r13 = r31
            r14 = r37
            r1 = r15
            r15 = r41
            r2.<init>(r3, r4, r5, r7, r9, r11, r13, r14, r15)
            goto L_0x0383
        L_0x036e:
            r46 = r9
            r47 = r11
            r48 = r12
            r1 = r15
            r43 = r20
            r42 = r26
            r45 = r28
            r44 = r34
            com.google.android.gms.internal.measurement.zzeq r27 = r2.zzie()
            r2 = r27
        L_0x0383:
            com.google.android.gms.internal.measurement.zzei r3 = r49.zzix()
            r3.zza((com.google.android.gms.internal.measurement.zzeq) r2)
            long r2 = r2.zzafr
            r4 = r38
            r5 = 0
            java.lang.Object r6 = r4.getOrDefault(r0, r5)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x03a9
            com.google.android.gms.internal.measurement.zzei r6 = r49.zzix()
            java.util.Map r6 = r6.zzk(r1, r0)
            if (r6 != 0) goto L_0x03a6
            u.b r6 = new u.b
            r6.<init>()
        L_0x03a6:
            r4.put(r0, r6)
        L_0x03a9:
            java.util.Set r7 = r6.keySet()
            java.util.Iterator r7 = r7.iterator()
            r15 = r1
        L_0x03b2:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0793
            java.lang.Object r1 = r7.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r9 = r47
            boolean r8 = r9.contains(r8)
            if (r8 == 0) goto L_0x03e2
            com.google.android.gms.internal.measurement.zzfg r8 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzit()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10 = r42
            r8.zzg(r10, r1)
            r47 = r9
            goto L_0x03b2
        L_0x03e2:
            r10 = r42
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r11 = r48
            java.lang.Object r8 = r11.getOrDefault(r8, r5)
            com.google.android.gms.internal.measurement.zzkm r8 = (com.google.android.gms.internal.measurement.zzkm) r8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r13 = r43
            java.lang.Object r12 = r13.getOrDefault(r12, r5)
            java.util.BitSet r12 = (java.util.BitSet) r12
            java.lang.Integer r14 = java.lang.Integer.valueOf(r1)
            r15 = r44
            java.lang.Object r14 = r15.getOrDefault(r14, r5)
            java.util.BitSet r14 = (java.util.BitSet) r14
            if (r8 != 0) goto L_0x0432
            com.google.android.gms.internal.measurement.zzkm r8 = new com.google.android.gms.internal.measurement.zzkm
            r8.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            r11.put(r12, r8)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r8.zzasy = r12
            java.util.BitSet r12 = new java.util.BitSet
            r12.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r13.put(r8, r12)
            java.util.BitSet r14 = new java.util.BitSet
            r14.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r15.put(r8, r14)
        L_0x0432:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object r8 = r6.get(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x0440:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x0783
            java.lang.Object r17 = r8.next()
            r5 = r17
            com.google.android.gms.internal.measurement.zzke r5 = (com.google.android.gms.internal.measurement.zzke) r5
            r38 = r4
            com.google.android.gms.internal.measurement.zzfg r4 = r49.zzge()
            r17 = r6
            r6 = 2
            boolean r4 = r4.isLoggable(r6)
            if (r4 == 0) goto L_0x0496
            com.google.android.gms.internal.measurement.zzfg r4 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzit()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r20 = r7
            java.lang.Integer r7 = r5.zzarp
            r26 = r8
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            r44 = r15
            java.lang.String r15 = r5.zzarq
            java.lang.String r8 = r8.zzbj(r15)
            java.lang.String r15 = "Evaluating filter. audience, filter, event"
            r4.zzd(r15, r6, r7, r8)
            com.google.android.gms.internal.measurement.zzfg r4 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzit()
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r6 = r6.zza((com.google.android.gms.internal.measurement.zzke) r5)
            r7 = r45
            r4.zzg(r7, r6)
            goto L_0x049e
        L_0x0496:
            r20 = r7
            r26 = r8
            r44 = r15
            r7 = r45
        L_0x049e:
            java.lang.Integer r4 = r5.zzarp
            if (r4 == 0) goto L_0x074b
            int r4 = r4.intValue()
            r6 = 256(0x100, float:3.59E-43)
            if (r4 <= r6) goto L_0x04ac
            goto L_0x074b
        L_0x04ac:
            java.lang.Integer r4 = r5.zzarp
            int r4 = r4.intValue()
            boolean r4 = r12.get(r4)
            if (r4 == 0) goto L_0x04d9
            com.google.android.gms.internal.measurement.zzfg r4 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r4 = r4.zzit()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r5 = r5.zzarp
            java.lang.String r15 = "Event filter already evaluated true. audience ID, filter ID"
            r4.zze(r15, r8, r5)
            r8 = r49
            r27 = r2
            r45 = r7
            r42 = r10
            r48 = r11
            r43 = r13
            goto L_0x076e
        L_0x04d9:
            com.google.android.gms.internal.measurement.zzkg r4 = r5.zzart
            r8 = r49
            if (r4 == 0) goto L_0x04fe
            java.lang.Boolean r4 = r8.zza((long) r2, (com.google.android.gms.internal.measurement.zzkg) r4)
            if (r4 != 0) goto L_0x04e9
            r27 = r2
            goto L_0x05bc
        L_0x04e9:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x04fe
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r27 = r2
            r45 = r7
            r42 = r10
            r48 = r11
            r43 = r13
            r7 = r4
            goto L_0x0715
        L_0x04fe:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.google.android.gms.internal.measurement.zzkf[] r15 = r5.zzarr
            int r6 = r15.length
            r27 = r2
            r2 = 0
        L_0x0509:
            if (r2 >= r6) goto L_0x0535
            r3 = r15[r2]
            r29 = r6
            java.lang.String r6 = r3.zzary
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x052b
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            java.lang.String r4 = "null or empty param name in filter. event"
            goto L_0x05b9
        L_0x052b:
            java.lang.String r3 = r3.zzary
            r4.add(r3)
            int r2 = r2 + 1
            r6 = r29
            goto L_0x0509
        L_0x0535:
            u.b r2 = new u.b
            r2.<init>()
            r3 = r46
            int r6 = r3.length
            r15 = 0
        L_0x053e:
            if (r15 >= r6) goto L_0x0589
            r29 = r6
            r6 = r3[r15]
            r46 = r3
            java.lang.String r3 = r6.name
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L_0x0582
            java.lang.Long r3 = r6.zzate
            if (r3 == 0) goto L_0x0553
            goto L_0x055c
        L_0x0553:
            java.lang.Double r3 = r6.zzarc
            if (r3 == 0) goto L_0x0558
            goto L_0x055c
        L_0x0558:
            java.lang.String r3 = r6.zzajf
            if (r3 == 0) goto L_0x0562
        L_0x055c:
            java.lang.String r6 = r6.name
            r2.put(r6, r3)
            goto L_0x0582
        L_0x0562:
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r4 = r49.zzga()
            java.lang.String r6 = r6.name
            java.lang.String r4 = r4.zzbk(r6)
            java.lang.String r6 = "Unknown value for param. event, param"
            r2.zze(r6, r3, r4)
            goto L_0x05bc
        L_0x0582:
            int r15 = r15 + 1
            r6 = r29
            r3 = r46
            goto L_0x053e
        L_0x0589:
            r46 = r3
            com.google.android.gms.internal.measurement.zzkf[] r3 = r5.zzarr
            int r4 = r3.length
            r6 = 0
        L_0x058f:
            if (r6 >= r4) goto L_0x070b
            r15 = r3[r6]
            r29 = r3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r30 = r4
            java.lang.Boolean r4 = r15.zzarx
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = r15.zzary
            boolean r31 = android.text.TextUtils.isEmpty(r4)
            if (r31 == 0) goto L_0x05c6
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            java.lang.String r4 = "Event has empty param name. event"
        L_0x05b9:
            r2.zzg(r4, r3)
        L_0x05bc:
            r45 = r7
            r42 = r10
            r48 = r11
            r43 = r13
            goto L_0x0709
        L_0x05c6:
            r45 = r7
            r43 = r13
            r7 = 0
            java.lang.Object r13 = r2.getOrDefault(r4, r7)
            boolean r7 = r13 instanceof java.lang.Long
            if (r7 == 0) goto L_0x0616
            com.google.android.gms.internal.measurement.zzkg r7 = r15.zzarw
            if (r7 != 0) goto L_0x05f7
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r4 = r6.zzbk(r4)
            java.lang.String r6 = "No number filter for long param. event, param"
            r42 = r10
            r48 = r11
            goto L_0x0706
        L_0x05f7:
            java.lang.Long r13 = (java.lang.Long) r13
            r42 = r10
            r48 = r11
            long r10 = r13.longValue()
            com.google.android.gms.internal.measurement.zzkg r4 = r15.zzarw
            java.lang.Boolean r4 = r8.zza((long) r10, (com.google.android.gms.internal.measurement.zzkg) r4)
            if (r4 != 0) goto L_0x060b
            goto L_0x0709
        L_0x060b:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0688
            goto L_0x06ed
        L_0x0616:
            r42 = r10
            r48 = r11
            boolean r7 = r13 instanceof java.lang.Double
            if (r7 == 0) goto L_0x0659
            com.google.android.gms.internal.measurement.zzkg r7 = r15.zzarw
            if (r7 != 0) goto L_0x063e
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r4 = r6.zzbk(r4)
            java.lang.String r6 = "No number filter for double param. event, param"
            goto L_0x0706
        L_0x063e:
            java.lang.Double r13 = (java.lang.Double) r13
            double r10 = r13.doubleValue()
            com.google.android.gms.internal.measurement.zzkg r4 = r15.zzarw
            java.lang.Boolean r4 = r8.zza((double) r10, (com.google.android.gms.internal.measurement.zzkg) r4)
            if (r4 != 0) goto L_0x064e
            goto L_0x0709
        L_0x064e:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0688
            goto L_0x06ed
        L_0x0659:
            boolean r7 = r13 instanceof java.lang.String
            if (r7 == 0) goto L_0x06ce
            com.google.android.gms.internal.measurement.zzki r7 = r15.zzarv
            if (r7 == 0) goto L_0x0668
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Boolean r4 = r8.zza((java.lang.String) r13, (com.google.android.gms.internal.measurement.zzki) r7)
            goto L_0x067a
        L_0x0668:
            com.google.android.gms.internal.measurement.zzkg r7 = r15.zzarw
            if (r7 == 0) goto L_0x06b3
            java.lang.String r13 = (java.lang.String) r13
            boolean r7 = com.google.android.gms.internal.measurement.zzka.zzck(r13)
            if (r7 == 0) goto L_0x0698
            com.google.android.gms.internal.measurement.zzkg r4 = r15.zzarw
            java.lang.Boolean r4 = r8.zza((java.lang.String) r13, (com.google.android.gms.internal.measurement.zzkg) r4)
        L_0x067a:
            if (r4 != 0) goto L_0x067e
            goto L_0x0709
        L_0x067e:
            boolean r4 = r4.booleanValue()
            r4 = r4 ^ 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0688
            goto L_0x06ed
        L_0x0688:
            int r6 = r6 + 1
            r3 = r29
            r4 = r30
            r10 = r42
            r13 = r43
            r7 = r45
            r11 = r48
            goto L_0x058f
        L_0x0698:
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r4 = r6.zzbk(r4)
            java.lang.String r6 = "Invalid param value for number filter. event, param"
            goto L_0x0706
        L_0x06b3:
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r4 = r6.zzbk(r4)
            java.lang.String r6 = "No filter for String param. event, param"
            goto L_0x0706
        L_0x06ce:
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            if (r13 != 0) goto L_0x06f0
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzit()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r4 = r6.zzbk(r4)
            java.lang.String r6 = "Missing param for filter. event, param"
            r2.zze(r6, r3, r4)
        L_0x06ed:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x0715
        L_0x06f0:
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            com.google.android.gms.internal.measurement.zzfe r3 = r49.zzga()
            java.lang.String r3 = r3.zzbj(r0)
            com.google.android.gms.internal.measurement.zzfe r6 = r49.zzga()
            java.lang.String r4 = r6.zzbk(r4)
            java.lang.String r6 = "Unknown param type. event, param"
        L_0x0706:
            r2.zze(r6, r3, r4)
        L_0x0709:
            r7 = 0
            goto L_0x0715
        L_0x070b:
            r45 = r7
            r42 = r10
            r48 = r11
            r43 = r13
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x0715:
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzit()
            if (r7 != 0) goto L_0x0722
            r3 = r18
            goto L_0x0723
        L_0x0722:
            r3 = r7
        L_0x0723:
            java.lang.String r4 = "Event filter result"
            r2.zzg(r4, r3)
            if (r7 != 0) goto L_0x0732
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r9.add(r2)
            goto L_0x076e
        L_0x0732:
            java.lang.Integer r2 = r5.zzarp
            int r2 = r2.intValue()
            r14.set(r2)
            boolean r2 = r7.booleanValue()
            if (r2 == 0) goto L_0x076e
            java.lang.Integer r2 = r5.zzarp
            int r2 = r2.intValue()
            r12.set(r2)
            goto L_0x076e
        L_0x074b:
            r8 = r49
            r27 = r2
            r45 = r7
            r42 = r10
            r48 = r11
            r43 = r13
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            java.lang.Object r3 = com.google.android.gms.internal.measurement.zzfg.zzbm(r50)
            java.lang.Integer r4 = r5.zzarp
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r2.zze(r5, r3, r4)
        L_0x076e:
            r6 = r17
            r7 = r20
            r8 = r26
            r2 = r27
            r4 = r38
            r10 = r42
            r13 = r43
            r15 = r44
            r11 = r48
            r5 = 0
            goto L_0x0440
        L_0x0783:
            r8 = r49
            r47 = r9
            r42 = r10
            r48 = r11
            r43 = r13
            r44 = r15
            r15 = r50
            goto L_0x03b2
        L_0x0793:
            r8 = r49
            r38 = r4
            r1 = r44
            r9 = r47
            r0 = r8
            r2 = r15
        L_0x079d:
            int r3 = r33 + 1
            r15 = r50
            r14 = r51
            r13 = r52
            r10 = r1
            r1 = r8
            r11 = r9
            r4 = r32
            r6 = r38
            r8 = r42
            r20 = r43
            r9 = r45
            r12 = r48
            goto L_0x010c
        L_0x07b6:
            r27 = r0
            r15 = r2
            r42 = r8
            r45 = r9
            r9 = r11
            r48 = r12
            r43 = r20
            r8 = r1
            r1 = r10
            r2 = r52
            goto L_0x07d7
        L_0x07c7:
            r42 = r8
            r45 = r9
            r9 = r11
            r48 = r12
            r43 = r20
            r8 = r1
            r1 = r10
            r15 = r50
            r2 = r52
            r0 = r8
        L_0x07d7:
            if (r2 == 0) goto L_0x0ab2
            u.b r3 = new u.b
            r3.<init>()
            int r4 = r2.length
            r5 = 0
        L_0x07e0:
            if (r5 >= r4) goto L_0x0ab2
            r6 = r2[r5]
            java.lang.String r7 = r6.name
            r10 = 0
            java.lang.Object r7 = r3.getOrDefault(r7, r10)
            java.util.Map r7 = (java.util.Map) r7
            if (r7 != 0) goto L_0x0805
            com.google.android.gms.internal.measurement.zzei r7 = r49.zzix()
            java.lang.String r10 = r6.name
            java.util.Map r7 = r7.zzl(r15, r10)
            if (r7 != 0) goto L_0x0800
            u.b r7 = new u.b
            r7.<init>()
        L_0x0800:
            java.lang.String r10 = r6.name
            r3.put(r10, r7)
        L_0x0805:
            java.util.Set r10 = r7.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x080d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0a9e
            java.lang.Object r11 = r10.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            boolean r12 = r9.contains(r12)
            if (r12 == 0) goto L_0x0839
            com.google.android.gms.internal.measurement.zzfg r12 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r12 = r12.zzit()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = r42
            r12.zzg(r13, r11)
            goto L_0x080d
        L_0x0839:
            r13 = r42
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14 = r48
            r15 = 0
            java.lang.Object r12 = r14.getOrDefault(r12, r15)
            com.google.android.gms.internal.measurement.zzkm r12 = (com.google.android.gms.internal.measurement.zzkm) r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r51 = r3
            r3 = r43
            java.lang.Object r2 = r3.getOrDefault(r2, r15)
            java.util.BitSet r2 = (java.util.BitSet) r2
            r16 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object r2 = r1.getOrDefault(r2, r15)
            java.util.BitSet r2 = (java.util.BitSet) r2
            if (r12 != 0) goto L_0x088d
            com.google.android.gms.internal.measurement.zzkm r2 = new com.google.android.gms.internal.measurement.zzkm
            r2.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r14.put(r12, r2)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r2.zzasy = r12
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r3.put(r12, r2)
            java.util.BitSet r12 = new java.util.BitSet
            r12.<init>()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r1.put(r15, r12)
            goto L_0x0890
        L_0x088d:
            r12 = r2
            r2 = r16
        L_0x0890:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            java.lang.Object r15 = r7.get(r15)
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x089e:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x0a80
            java.lang.Object r16 = r15.next()
            r17 = r4
            r4 = r16
            com.google.android.gms.internal.measurement.zzkh r4 = (com.google.android.gms.internal.measurement.zzkh) r4
            r16 = r7
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            r8 = 2
            boolean r7 = r7.isLoggable(r8)
            if (r7 == 0) goto L_0x08f4
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzit()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            r19 = r10
            java.lang.Integer r10 = r4.zzarp
            r42 = r13
            com.google.android.gms.internal.measurement.zzfe r13 = r49.zzga()
            r20 = r15
            java.lang.String r15 = r4.zzasf
            java.lang.String r13 = r13.zzbl(r15)
            java.lang.String r15 = "Evaluating filter. audience, filter, property"
            r7.zzd(r15, r8, r10, r13)
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzit()
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            java.lang.String r8 = r8.zza((com.google.android.gms.internal.measurement.zzkh) r4)
            r10 = r45
            r7.zzg(r10, r8)
            goto L_0x08fc
        L_0x08f4:
            r19 = r10
            r42 = r13
            r20 = r15
            r10 = r45
        L_0x08fc:
            java.lang.Integer r7 = r4.zzarp
            if (r7 == 0) goto L_0x0a5f
            int r7 = r7.intValue()
            r8 = 256(0x100, float:3.59E-43)
            if (r7 <= r8) goto L_0x090a
            goto L_0x0a5f
        L_0x090a:
            java.lang.Integer r7 = r4.zzarp
            int r7 = r7.intValue()
            boolean r7 = r2.get(r7)
            if (r7 == 0) goto L_0x092d
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzit()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r4 = r4.zzarp
            java.lang.String r15 = "Property filter already evaluated true. audience ID, filter ID"
            r7.zze(r15, r13, r4)
            r48 = r14
            goto L_0x0a4d
        L_0x092d:
            com.google.android.gms.internal.measurement.zzkf r7 = r4.zzasg
            if (r7 != 0) goto L_0x0949
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()
            com.google.android.gms.internal.measurement.zzfe r13 = r49.zzga()
            java.lang.String r15 = r6.name
            java.lang.String r13 = r13.zzbl(r15)
            java.lang.String r15 = "Missing property filter. property"
            r7.zzg(r15, r13)
            goto L_0x0970
        L_0x0949:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r15 = r7.zzarx
            boolean r13 = r13.equals(r15)
            java.lang.Long r15 = r6.zzate
            if (r15 == 0) goto L_0x0982
            com.google.android.gms.internal.measurement.zzkg r8 = r7.zzarw
            if (r8 != 0) goto L_0x0974
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            java.lang.String r13 = r6.name
            java.lang.String r8 = r8.zzbl(r13)
            java.lang.String r13 = "No number filter for long property. property"
            r7.zzg(r13, r8)
        L_0x0970:
            r48 = r14
            goto L_0x0a17
        L_0x0974:
            r48 = r14
            long r14 = r15.longValue()
            com.google.android.gms.internal.measurement.zzkg r7 = r7.zzarw
            java.lang.Boolean r7 = r0.zza((long) r14, (com.google.android.gms.internal.measurement.zzkg) r7)
            goto L_0x09fb
        L_0x0982:
            r48 = r14
            java.lang.Double r8 = r6.zzarc
            if (r8 == 0) goto L_0x09ad
            com.google.android.gms.internal.measurement.zzkg r14 = r7.zzarw
            if (r14 != 0) goto L_0x09a2
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            java.lang.String r13 = r6.name
            java.lang.String r8 = r8.zzbl(r13)
            java.lang.String r13 = "No number filter for double property. property"
            goto L_0x0a14
        L_0x09a2:
            double r14 = r8.doubleValue()
            com.google.android.gms.internal.measurement.zzkg r7 = r7.zzarw
            java.lang.Boolean r7 = r0.zza((double) r14, (com.google.android.gms.internal.measurement.zzkg) r7)
            goto L_0x09fb
        L_0x09ad:
            java.lang.String r8 = r6.zzajf
            if (r8 == 0) goto L_0x0a00
            com.google.android.gms.internal.measurement.zzki r14 = r7.zzarv
            if (r14 != 0) goto L_0x09f7
            com.google.android.gms.internal.measurement.zzkg r14 = r7.zzarw
            if (r14 != 0) goto L_0x09ce
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            java.lang.String r13 = r6.name
            java.lang.String r8 = r8.zzbl(r13)
            java.lang.String r13 = "No string or number filter defined. property"
            goto L_0x0a14
        L_0x09ce:
            boolean r8 = com.google.android.gms.internal.measurement.zzka.zzck(r8)
            if (r8 == 0) goto L_0x09dd
            java.lang.String r8 = r6.zzajf
            com.google.android.gms.internal.measurement.zzkg r7 = r7.zzarw
            java.lang.Boolean r7 = r0.zza((java.lang.String) r8, (com.google.android.gms.internal.measurement.zzkg) r7)
            goto L_0x09fb
        L_0x09dd:
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            java.lang.String r13 = r6.name
            java.lang.String r8 = r8.zzbl(r13)
            java.lang.String r13 = r6.zzajf
            java.lang.String r14 = "Invalid user property value for Numeric number filter. property, value"
            r7.zze(r14, r8, r13)
            goto L_0x0a17
        L_0x09f7:
            java.lang.Boolean r7 = r0.zza((java.lang.String) r8, (com.google.android.gms.internal.measurement.zzki) r14)
        L_0x09fb:
            java.lang.Boolean r7 = zza((java.lang.Boolean) r7, (boolean) r13)
            goto L_0x0a18
        L_0x0a00:
            com.google.android.gms.internal.measurement.zzfg r7 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r7 = r7.zzip()
            com.google.android.gms.internal.measurement.zzfe r8 = r49.zzga()
            java.lang.String r13 = r6.name
            java.lang.String r8 = r8.zzbl(r13)
            java.lang.String r13 = "User property has no value, property"
        L_0x0a14:
            r7.zzg(r13, r8)
        L_0x0a17:
            r7 = 0
        L_0x0a18:
            com.google.android.gms.internal.measurement.zzfg r8 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r8 = r8.zzit()
            if (r7 != 0) goto L_0x0a25
            r13 = r18
            goto L_0x0a26
        L_0x0a25:
            r13 = r7
        L_0x0a26:
            java.lang.String r14 = "Property filter result"
            r8.zzg(r14, r13)
            if (r7 != 0) goto L_0x0a35
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r9.add(r4)
            goto L_0x0a4d
        L_0x0a35:
            java.lang.Integer r8 = r4.zzarp
            int r8 = r8.intValue()
            r12.set(r8)
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0a4d
            java.lang.Integer r4 = r4.zzarp
            int r4 = r4.intValue()
            r2.set(r4)
        L_0x0a4d:
            r8 = r49
            r45 = r10
            r7 = r16
            r4 = r17
            r10 = r19
            r15 = r20
            r13 = r42
            r14 = r48
            goto L_0x089e
        L_0x0a5f:
            r48 = r14
            com.google.android.gms.internal.measurement.zzfg r2 = r49.zzge()
            com.google.android.gms.internal.measurement.zzfi r2 = r2.zzip()
            java.lang.Object r7 = com.google.android.gms.internal.measurement.zzfg.zzbm(r50)
            java.lang.Integer r4 = r4.zzarp
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r2.zze(r8, r7, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r9.add(r2)
            goto L_0x0a8c
        L_0x0a80:
            r17 = r4
            r16 = r7
            r19 = r10
            r42 = r13
            r48 = r14
            r10 = r45
        L_0x0a8c:
            r8 = r49
            r2 = r52
            r43 = r3
            r45 = r10
            r7 = r16
            r4 = r17
            r10 = r19
            r3 = r51
            goto L_0x080d
        L_0x0a9e:
            r51 = r3
            r17 = r4
            r3 = r43
            r10 = r45
            int r5 = r5 + 1
            r8 = r49
            r15 = r50
            r2 = r52
            r3 = r51
            goto L_0x07e0
        L_0x0ab2:
            r3 = r43
            int r0 = r3.f332583f
            com.google.android.gms.internal.measurement.zzkm[] r2 = new com.google.android.gms.internal.measurement.zzkm[r0]
            java.util.Set r0 = r3.keySet()
            u.h$c r0 = (p1042u.C118556h.C118559c) r0
            java.util.Iterator r4 = r0.iterator()
            r8 = 0
        L_0x0ac3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0bbd
            java.lang.Object r0 = r4.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            boolean r5 = r9.contains(r5)
            if (r5 != 0) goto L_0x0bb9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = r48
            r7 = 0
            java.lang.Object r5 = r6.getOrDefault(r5, r7)
            com.google.android.gms.internal.measurement.zzkm r5 = (com.google.android.gms.internal.measurement.zzkm) r5
            if (r5 != 0) goto L_0x0af1
            com.google.android.gms.internal.measurement.zzkm r5 = new com.google.android.gms.internal.measurement.zzkm
            r5.<init>()
        L_0x0af1:
            int r7 = r8 + 1
            r2[r8] = r5
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r5.zzarl = r8
            com.google.android.gms.internal.measurement.zzkr r8 = new com.google.android.gms.internal.measurement.zzkr
            r8.<init>()
            r5.zzasw = r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r11 = 0
            java.lang.Object r10 = r3.getOrDefault(r10, r11)
            java.util.BitSet r10 = (java.util.BitSet) r10
            long[] r10 = com.google.android.gms.internal.measurement.zzka.zza((java.util.BitSet) r10)
            r8.zzaul = r10
            com.google.android.gms.internal.measurement.zzkr r8 = r5.zzasw
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Object r10 = r1.getOrDefault(r10, r11)
            java.util.BitSet r10 = (java.util.BitSet) r10
            long[] r10 = com.google.android.gms.internal.measurement.zzka.zza((java.util.BitSet) r10)
            r8.zzauk = r10
            com.google.android.gms.internal.measurement.zzei r8 = r49.zzix()
            com.google.android.gms.internal.measurement.zzkr r5 = r5.zzasw
            r8.zzch()
            r8.zzab()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r50)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            int r10 = r5.zzvm()     // Catch:{ IOException -> 0x0b9e }
            byte[] r11 = new byte[r10]     // Catch:{ IOException -> 0x0b9e }
            r12 = 0
            com.google.android.gms.internal.measurement.zzabw r10 = com.google.android.gms.internal.measurement.zzabw.zzb(r11, r12, r10)     // Catch:{ IOException -> 0x0b99 }
            r5.zza(r10)     // Catch:{ IOException -> 0x0b99 }
            r10.zzve()     // Catch:{ IOException -> 0x0b99 }
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r10 = "app_id"
            r13 = r50
            r5.put(r10, r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = "audience_id"
            r5.put(r10, r0)
            java.lang.String r0 = "current_results"
            r5.put(r0, r11)
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0b88 }
            java.lang.String r10 = "audience_filter_values"
            r11 = 5
            r14 = 0
            long r10 = r0.insertWithOnConflict(r10, r14, r5, r11)     // Catch:{ SQLiteException -> 0x0b86 }
            r15 = -1
            int r0 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0bb4
            com.google.android.gms.internal.measurement.zzfg r0 = r8.zzge()     // Catch:{ SQLiteException -> 0x0b86 }
            com.google.android.gms.internal.measurement.zzfi r0 = r0.zzim()     // Catch:{ SQLiteException -> 0x0b86 }
            java.lang.String r5 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r10 = com.google.android.gms.internal.measurement.zzfg.zzbm(r50)     // Catch:{ SQLiteException -> 0x0b86 }
            r0.zzg(r5, r10)     // Catch:{ SQLiteException -> 0x0b86 }
            goto L_0x0bb4
        L_0x0b86:
            r0 = move-exception
            goto L_0x0b8a
        L_0x0b88:
            r0 = move-exception
            r14 = 0
        L_0x0b8a:
            com.google.android.gms.internal.measurement.zzfg r5 = r8.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r50)
            java.lang.String r10 = "Error storing filter results. appId"
            goto L_0x0bb1
        L_0x0b99:
            r0 = move-exception
            r13 = r50
        L_0x0b9c:
            r14 = 0
            goto L_0x0ba3
        L_0x0b9e:
            r0 = move-exception
            r13 = r50
            r12 = 0
            goto L_0x0b9c
        L_0x0ba3:
            com.google.android.gms.internal.measurement.zzfg r5 = r8.zzge()
            com.google.android.gms.internal.measurement.zzfi r5 = r5.zzim()
            java.lang.Object r8 = com.google.android.gms.internal.measurement.zzfg.zzbm(r50)
            java.lang.String r10 = "Configuration loss. Failed to serialize filter results. appId"
        L_0x0bb1:
            r5.zze(r10, r8, r0)
        L_0x0bb4:
            r48 = r6
            r8 = r7
            goto L_0x0ac3
        L_0x0bb9:
            r13 = r50
            goto L_0x0ac3
        L_0x0bbd:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r8)
            com.google.android.gms.internal.measurement.zzkm[] r0 = (com.google.android.gms.internal.measurement.zzkm[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeb.zza(java.lang.String, com.google.android.gms.internal.measurement.zzkn[], com.google.android.gms.internal.measurement.zzks[]):com.google.android.gms.internal.measurement.zzkm[]");
    }

    public final boolean zzhf() {
        return false;
    }
}
