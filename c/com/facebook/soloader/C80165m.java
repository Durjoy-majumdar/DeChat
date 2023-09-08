package com.facebook.soloader;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* renamed from: com.facebook.soloader.m */
public final class C80165m {

    /* renamed from: com.facebook.soloader.m$a */
    public static class C80166a extends RuntimeException {
        public C80166a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static String[] m97472a(C80151f fVar) {
        if (!(fVar instanceof C80152g)) {
            return m97473b(fVar);
        }
        C80152g gVar = (C80152g) fVar;
        int i = 0;
        while (true) {
            try {
                return m97473b(gVar);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i <= 4) {
                    Thread.interrupted();
                    gVar.getClass();
                    FileInputStream fileInputStream = new FileInputStream(gVar.f234657d);
                    gVar.f234658e = fileInputStream;
                    gVar.f234659f = fileInputStream.getChannel();
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: b */
    public static String[] m97473b(C80151f fVar) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j15;
        int i2;
        long j16;
        long j17;
        C80151f fVar2 = fVar;
        int i3 = 8;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        long d = m97475d(fVar2, allocate, 0);
        if (d == 1179403647) {
            m97476e(fVar2, allocate, 1, 4);
            boolean z = ((short) (allocate.get() & ExifInterface.MARKER)) == 1;
            m97476e(fVar2, allocate, 1, 5);
            if (((short) (allocate.get() & ExifInterface.MARKER)) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z) {
                j = m97475d(fVar2, allocate, 28);
            } else {
                m97476e(fVar2, allocate, 8, 32);
                j = allocate.getLong();
            }
            long c = z ? (long) m97474c(fVar2, allocate, 44) : (long) m97474c(fVar2, allocate, 56);
            int c2 = m97474c(fVar2, allocate, z ? 42 : 54);
            if (c == 65535) {
                if (z) {
                    j17 = m97475d(fVar2, allocate, 32);
                } else {
                    m97476e(fVar2, allocate, 8, 40);
                    j17 = allocate.getLong();
                }
                c = z ? m97475d(fVar2, allocate, j17 + 28) : m97475d(fVar2, allocate, j17 + 44);
            }
            long j18 = j;
            long j19 = 0;
            while (true) {
                if (j19 >= c) {
                    j2 = 0;
                    break;
                }
                if ((z ? m97475d(fVar2, allocate, j18 + 0) : m97475d(fVar2, allocate, j18 + 0)) != 2) {
                    j18 += (long) c2;
                    j19++;
                } else if (z) {
                    j2 = m97475d(fVar2, allocate, j18 + 4);
                } else {
                    m97476e(fVar2, allocate, 8, j18 + 8);
                    j2 = allocate.getLong();
                }
            }
            long j25 = 0;
            if (j2 != 0) {
                long j26 = j2;
                long j27 = 0;
                int i4 = 0;
                while (true) {
                    if (z) {
                        j3 = j2;
                        j4 = m97475d(fVar2, allocate, j26 + j25);
                    } else {
                        j3 = j2;
                        m97476e(fVar2, allocate, 8, j26 + j25);
                        j4 = allocate.getLong();
                    }
                    if (j4 == 1) {
                        if (i4 != Integer.MAX_VALUE) {
                            i4++;
                            i = c2;
                        } else {
                            throw new C80166a("malformed DT_NEEDED section");
                        }
                    } else if (j4 == 5) {
                        if (z) {
                            i = c2;
                            i2 = i4;
                            j16 = m97475d(fVar2, allocate, j26 + 4);
                        } else {
                            i = c2;
                            i2 = i4;
                            m97476e(fVar2, allocate, 8, j26 + 8);
                            j16 = allocate.getLong();
                        }
                        j27 = j16;
                        i4 = i2;
                    } else {
                        i = c2;
                        int i5 = i4;
                    }
                    j26 += z ? 8 : 16;
                    j25 = 0;
                    if (j4 != 0) {
                        j2 = j3;
                        c2 = i;
                    } else if (j27 != 0) {
                        int i6 = 0;
                        while (true) {
                            if (((long) i6) >= c) {
                                j5 = 0;
                                break;
                            }
                            if ((z ? m97475d(fVar2, allocate, j + j25) : m97475d(fVar2, allocate, j + j25)) == 1) {
                                if (z) {
                                    j8 = m97475d(fVar2, allocate, j + 8);
                                } else {
                                    m97476e(fVar2, allocate, 8, j + 16);
                                    j8 = allocate.getLong();
                                }
                                if (z) {
                                    j9 = m97475d(fVar2, allocate, j + 20);
                                } else {
                                    m97476e(fVar2, allocate, 8, j + 40);
                                    j9 = allocate.getLong();
                                }
                                if (j8 <= j27 && j27 < j9 + j8) {
                                    if (z) {
                                        j15 = m97475d(fVar2, allocate, j + 4);
                                    } else {
                                        m97476e(fVar2, allocate, 8, j + 8);
                                        j15 = allocate.getLong();
                                    }
                                    j5 = j15 + (j27 - j8);
                                }
                            }
                            int i7 = i;
                            j += (long) i7;
                            i6++;
                            i = i7;
                            j25 = 0;
                        }
                        long j28 = 0;
                        if (j5 != 0) {
                            String[] strArr = new String[i4];
                            int i8 = 0;
                            while (true) {
                                long j29 = j3 + j28;
                                if (z) {
                                    j6 = m97475d(fVar2, allocate, j29);
                                } else {
                                    m97476e(fVar2, allocate, i3, j29);
                                    j6 = allocate.getLong();
                                }
                                if (j6 == 1) {
                                    if (z) {
                                        j7 = m97475d(fVar2, allocate, j3 + 4);
                                    } else {
                                        m97476e(fVar2, allocate, i3, j3 + 8);
                                        j7 = allocate.getLong();
                                    }
                                    long j35 = j7 + j5;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j36 = j35 + 1;
                                        m97476e(fVar2, allocate, 1, j35);
                                        short s = (short) (allocate.get() & ExifInterface.MARKER);
                                        if (s == 0) {
                                            break;
                                        }
                                        sb.append((char) s);
                                        j35 = j36;
                                    }
                                    strArr[i8] = sb.toString();
                                    if (i8 != Integer.MAX_VALUE) {
                                        i8++;
                                    } else {
                                        throw new C80166a("malformed DT_NEEDED section");
                                    }
                                }
                                j3 += z ? 8 : 16;
                                if (j6 != 0) {
                                    j28 = 0;
                                    i3 = 8;
                                } else if (i8 == i4) {
                                    return strArr;
                                } else {
                                    throw new C80166a("malformed DT_NEEDED section");
                                }
                            }
                        } else {
                            throw new C80166a("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new C80166a("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new C80166a("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new C80166a("file is not ELF: 0x" + Long.toHexString(d));
        }
    }

    /* renamed from: c */
    public static int m97474c(C80151f fVar, ByteBuffer byteBuffer, long j) {
        m97476e(fVar, byteBuffer, 2, j);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    public static long m97475d(C80151f fVar, ByteBuffer byteBuffer, long j) {
        m97476e(fVar, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & Util.MAX_32BIT_VALUE;
    }

    /* renamed from: e */
    public static void m97476e(C80151f fVar, ByteBuffer byteBuffer, int i, long j) {
        int w;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (w = fVar.mo110966w(byteBuffer, j)) != -1) {
            j += (long) w;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C80166a("ELF file truncated");
    }
}
