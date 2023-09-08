package ff0;

import cf0.C80030i;
import com.tencent.stubs.logger.Log;
import df0.C86271a;
import hf0.C87485a;
import hf0.C87489d;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ff0.c */
public class C86866c {
    /* renamed from: a */
    public static final long m107877a(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new C86865b("Bad value for " + str + ": " + j);
    }

    /* renamed from: b */
    public static void m107878b(DataInputStream dataInputStream, List<Long> list, List<String> list2) {
        try {
            int readInt = dataInputStream.readInt();
            m107877a((long) readInt, "deltaFriendlyNewFileWorkRangeLength - readMinEntry");
            for (int i = 0; i < readInt; i++) {
                dataInputStream.readInt();
                dataInputStream.readLong();
                dataInputStream.readLong();
                dataInputStream.readLong();
                long readInt2 = (long) dataInputStream.readInt();
                m107877a(readInt2, "readMinEntry - getGeneralPurposeFlagBit11");
                dataInputStream.readLong();
                dataInputStream.readLong();
                long readInt3 = (long) dataInputStream.readInt();
                m107877a(readInt3, "readMinEntry - getFileNameBytesSize");
                if (readInt3 > 0) {
                    if (list == null || !list.contains(Long.valueOf((long) i))) {
                        dataInputStream.skipBytes((int) readInt3);
                    } else {
                        byte[] bArr = new byte[((int) readInt3)];
                        dataInputStream.readFully(bArr);
                        list2.add(C86271a.m106880a(bArr, readInt2 == 1));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public C87489d mo121328c(DataInputStream dataInputStream) {
        String str;
        DataInputStream dataInputStream2 = dataInputStream;
        byte[] bytes = "MMPATCH7Z1_0".getBytes("US-ASCII");
        byte[] bArr = new byte[bytes.length];
        dataInputStream2.readFully(bArr);
        if (Arrays.equals(bytes, bArr)) {
            dataInputStream2.skip(4);
            long readLong = dataInputStream.readLong();
            m107877a(readLong, "delta-friendly old file size");
            int readInt = dataInputStream.readInt();
            if (readInt > 0) {
                byte[] bArr2 = new byte[readInt];
                dataInputStream2.readFully(bArr2);
                str = new String(bArr2, StandardCharsets.UTF_8);
            } else {
                str = "";
            }
            long readLong2 = dataInputStream.readLong();
            m107877a(readLong2, "newFileSize file size");
            Log.m106505i("HdiffApk-MMPatchReader", "checkNonNegative, newFileSize = " + readLong2 + ", newFileMD5Length = " + readInt + ", newFileMD5 = " + str);
            PrintStream printStream = System.out;
            printStream.println("checkNonNegative, newFileSize = " + readLong2 + ", newFileMD5Length = " + readInt + ", newFileMD5 = " + str);
            long readInt2 = (long) dataInputStream.readInt();
            m107877a(readInt2, "old file uncompression instruction count");
            int i = (int) readInt2;
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            long j = -1;
            while (i2 < i) {
                long j2 = readLong;
                long readLong3 = dataInputStream.readLong();
                m107877a(readLong3, "old file uncompression range offset");
                long readLong4 = dataInputStream.readLong();
                m107877a(readLong4, "old file uncompression range length");
                long j3 = readLong2;
                long readInt3 = (long) dataInputStream.readInt();
                m107877a(readInt3, "delta-friendly new file recompression range length");
                boolean z = readInt3 == 1;
                if (readLong3 >= j) {
                    arrayList.add(new C80030i(readLong3, readLong4, null, z));
                    j = readLong3 + readLong4;
                    i2++;
                    readLong = j2;
                    readLong2 = j3;
                } else {
                    throw new C86865b("old file uncompression ranges out of order or overlapping");
                }
            }
            long j4 = readLong;
            long j5 = readLong2;
            int readInt4 = dataInputStream.readInt();
            m107877a((long) readInt4, "numDeltaFriendlyNewFileRecompressionInstructions");
            ArrayList arrayList2 = new ArrayList(readInt4);
            int i3 = 0;
            long j6 = -1;
            while (i3 < readInt4) {
                long readLong5 = dataInputStream.readLong();
                m107877a(readLong5, "delta-friendly new file recompression range offset");
                long readLong6 = dataInputStream.readLong();
                m107877a(readLong6, "delta-friendly new file recompression range length");
                long readInt5 = (long) dataInputStream.readInt();
                m107877a(readInt5, "isDeflateCompressedIndex");
                boolean z2 = readInt5 == 1;
                if (readLong5 >= j6) {
                    j6 = readLong5 + readLong6;
                    arrayList2.add(new C80030i(readLong5, readLong6, null, z2));
                    i3++;
                } else {
                    throw new C86865b("delta-friendly new file recompression ranges out of order or overlapping");
                }
            }
            int readInt6 = dataInputStream.readInt();
            m107877a((long) readInt6, "mapSizePosNewToOldSize");
            for (int i4 = 0; i4 < readInt6; i4++) {
                dataInputStream.readLong();
                dataInputStream.readLong();
            }
            int readInt7 = dataInputStream.readInt();
            ArrayList arrayList3 = new ArrayList(readInt7);
            for (int i5 = 0; i5 < readInt7; i5++) {
                long readLong7 = dataInputStream.readLong();
                m107877a(readLong7, "newPosIndex - error");
                arrayList3.add(Long.valueOf(readLong7));
            }
            Collections.sort(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            System.currentTimeMillis();
            m107878b(dataInputStream2, arrayList3, arrayList4);
            m107878b(dataInputStream2, (List<Long>) null, arrayList4);
            long readInt8 = (long) dataInputStream.readInt();
            int i6 = (readInt8 > 1 ? 1 : (readInt8 == 1 ? 0 : -1));
            if (i6 < 0 || i6 > 0) {
                throw new C86865b("Bad value for " + "num delta records" + ": " + readInt8 + " (valid range: [" + 1 + "," + 1 + "]");
            }
            int i7 = (int) readInt8;
            ArrayList arrayList5 = new ArrayList(i7);
            int i8 = 0;
            while (i8 < i7) {
                dataInputStream.readByte();
                long readLong8 = dataInputStream.readLong();
                m107877a(readLong8, "deltaDescriptors - deltaFriendlyOldFileWorkRangeOffset");
                long readLong9 = dataInputStream.readLong();
                m107877a(readLong9, "deltaDescriptors - deltaFriendlyOldFileWorkRangeLength");
                long readLong10 = dataInputStream.readLong();
                m107877a(readLong10, "deltaDescriptors - deltaFriendlyNewFileWorkRangeOffset");
                ArrayList arrayList6 = arrayList4;
                long readLong11 = dataInputStream.readLong();
                m107877a(readLong11, "deltaDescriptors - deltaFriendlyNewFileWorkRangeLength");
                long readLong12 = dataInputStream.readLong();
                m107877a(readLong12, "delta length");
                arrayList5.add(new C87485a(new C80030i(readLong8, readLong9, null), new C80030i(readLong10, readLong11, null), readLong12));
                i8++;
                DataInputStream dataInputStream3 = dataInputStream;
                arrayList2 = arrayList2;
                arrayList4 = arrayList6;
                arrayList = arrayList;
                i7 = i7;
                arrayList3 = arrayList3;
            }
            return new C87489d(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2), j4, Collections.unmodifiableList(arrayList5), str, j5, ((C87485a) arrayList5.get(0)).f253474a.f234465e, ((C87485a) arrayList5.get(0)).f253475b.f234465e, arrayList3, arrayList4);
        }
        throw new C86865b("Bad identifier");
    }
}
