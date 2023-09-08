package ni3;

import cy3.C58003b;
import cy3.C86147a;
import gy3.C87412m;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import oi3.C89230a;
import pi3.C89351a;
import pi3.C89352b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;
import z04.C119027c;

/* renamed from: ni3.e */
public final class C88949e {

    /* renamed from: a */
    public static final C88949e f256525a = new C88949e();

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final int mo123335a(String str, String str2, String str3, C88944a aVar) {
        Throwable th;
        int i;
        int i2;
        Iterable<C88945b> iterable;
        Throwable th4;
        Object obj;
        Throwable th5;
        Throwable th6;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C88944a aVar2 = aVar;
        C87412m.m108594g(str4, "apkFilePath");
        C87412m.m108594g(str5, "cPatchPath");
        C87412m.m108594g(str6, "outPatchFilePath");
        C87412m.m108594g(aVar2, "patcher");
        File a = C88951g.m111055a();
        File a2 = C88951g.m111055a();
        File a3 = C88951g.m111055a();
        String str7 = "apkFriendFile = " + a.getAbsolutePath() + ' ';
        C87412m.m108594g(str7, "msg");
        String str8 = "MicroMsg.PatchCompressor";
        C88946c.f256524a.mo122773i(str8, str7);
        String str9 = "patchFriendFile = " + a2.getAbsolutePath() + ' ';
        C87412m.m108594g(str9, "msg");
        C88946c.f256524a.mo122773i(str8, str9);
        String str10 = "hPatchFileNoMagic = " + a3.getAbsolutePath() + ' ';
        C87412m.m108594g(str10, "msg");
        C88946c.f256524a.mo122773i(str8, str10);
        ZipFile zipFile = new ZipFile(new File(str4));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                C87412m.m108593f(entries, "zf.entries()");
                ArrayList<T> list = Collections.list(entries);
                C87412m.m108593f(list, "list(this)");
                Iterator<T> it = list.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    InputStream inputStream = zipFile.getInputStream((ZipEntry) it.next());
                    C87412m.m108593f(inputStream, "zf.getInputStream(it)");
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                }
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(fileOutputStream, (Throwable) null);
                C58003b.m67160a(zipFile, (Throwable) null);
                String m = C87412m.m108600m("apk mergeFile len: ", Long.valueOf(a.length()));
                C87412m.m108594g(m, "msg");
                C88946c.f256524a.mo122773i("MicroMsg.ZipUncompress", m);
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File(str5)));
                try {
                    if (dataInputStream.readLong() != 96093072812398L) {
                        C58003b.m67160a(dataInputStream, (Throwable) null);
                    } else {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(a3);
                        try {
                            C86147a.m106660b(dataInputStream, fileOutputStream2, 0, 2, (Object) null);
                            fileOutputStream2.flush();
                            C58003b.m67160a(fileOutputStream2, (Throwable) null);
                            C58003b.m67160a(dataInputStream, (Throwable) null);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            C58003b.m67160a(fileOutputStream2, th6);
                            throw th8;
                        }
                    }
                    String absolutePath = a.getAbsolutePath();
                    C87412m.m108593f(absolutePath, "apkFriendFile.absolutePath");
                    String absolutePath2 = a3.getAbsolutePath();
                    C87412m.m108593f(absolutePath2, "hPatchFileNoMagic.absolutePath");
                    String absolutePath3 = a2.getAbsolutePath();
                    C87412m.m108593f(absolutePath3, "patchFriendFile.absolutePath");
                    int a4 = aVar2.mo123280a(absolutePath, absolutePath2, absolutePath3);
                    String absolutePath4 = a2.getAbsolutePath();
                    C87412m.m108593f(absolutePath4, "patchFriendFile.absolutePath");
                    C88946c.f256524a.mo122771d("MicroMsg.ZipUncompress", "friendlyToZipFile");
                    File a5 = C88951g.m111055a();
                    C88951g.m111055a();
                    DataInputStream dataInputStream2 = new DataInputStream(new FileInputStream(new File(absolutePath4)));
                    try {
                        if (dataInputStream2.readLong() != 96093072812398L) {
                            C58003b.m67160a(dataInputStream2, (Throwable) null);
                            iterable = C64186f0.f181907d;
                            i2 = a4;
                        } else {
                            int readInt = dataInputStream2.readInt();
                            ArrayList arrayList = new ArrayList();
                            int i3 = 0;
                            while (i3 < readInt) {
                                i3++;
                                int readInt2 = dataInputStream2.readInt();
                                byte[] bArr2 = new byte[readInt2];
                                dataInputStream2.read(bArr2, i, readInt2);
                                arrayList.add(new C88945b(new String(bArr2, C119027c.f356488a), new C88950f(dataInputStream2.readLong(), dataInputStream2.readLong()), dataInputStream2.readBoolean()));
                                a4 = a4;
                                readInt = readInt;
                                i = 0;
                            }
                            i2 = a4;
                            FileOutputStream fileOutputStream3 = new FileOutputStream(a5);
                            try {
                                C86147a.m106660b(dataInputStream2, fileOutputStream3, 0, 2, (Object) null);
                                fileOutputStream3.flush();
                                C13598b0 b0Var2 = C13598b0.f38549a;
                                C58003b.m67160a(fileOutputStream3, (Throwable) null);
                                C58003b.m67160a(dataInputStream2, (Throwable) null);
                                iterable = arrayList;
                            } catch (Throwable th9) {
                                Throwable th10 = th9;
                                C58003b.m67160a(fileOutputStream3, th5);
                                throw th10;
                            }
                        }
                        File file = new File(str6);
                        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                        try {
                            C89230a aVar3 = new C89230a(a5);
                            try {
                                C110818d0.m150943o0(iterable, new C88953i());
                                for (C88945b bVar : iterable) {
                                    ZipEntry zipEntry = new ZipEntry(bVar.f256520a);
                                    zipEntry.setMethod(8);
                                    zipOutputStream.putNextEntry(zipEntry);
                                    C88950f fVar = bVar.f256521b;
                                    long j = fVar.f256527b;
                                    String str11 = str8;
                                    aVar3.mo123549a(fVar.f256526a, j);
                                    String str12 = bVar.f256520a + "before DEFLATED: " + bVar.f256521b;
                                    C87412m.m108594g(str12, "msg");
                                    C88946c.f256524a.mo122773i("MicroMsg.ZipUncompress", str12);
                                    byte[] bArr3 = new byte[16384];
                                    while (true) {
                                        int read2 = aVar3.read(bArr3);
                                        if (read2 < 0) {
                                            break;
                                        }
                                        zipOutputStream.write(bArr3, 0, read2);
                                    }
                                    zipOutputStream.flush();
                                    zipOutputStream.flush();
                                    zipOutputStream.closeEntry();
                                    str8 = str11;
                                }
                                String str13 = str8;
                                C13598b0 b0Var3 = C13598b0.f38549a;
                                C58003b.m67160a(aVar3, (Throwable) null);
                                C58003b.m67160a(zipOutputStream, (Throwable) null);
                                C89230a aVar4 = new C89230a(file);
                                try {
                                    List<C89351a> a6 = C89352b.m111682a(aVar4);
                                    aVar4.close();
                                    C110818d0.m150943o0(a6, new C88952h());
                                    for (C88945b bVar2 : iterable) {
                                        Iterator it4 = ((ArrayList) a6).iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it4.next();
                                            if (C87412m.m108589b(((C89351a) obj).f257340i, bVar2.f256520a)) {
                                                break;
                                            }
                                        }
                                        C89351a aVar5 = (C89351a) obj;
                                        if (aVar5 != null) {
                                            C88950f fVar2 = new C88950f(aVar5.f257339h, aVar5.f257334c);
                                            bVar2.getClass();
                                            bVar2.f256523d = fVar2;
                                            String str14 = bVar2.f256520a + "after DEFLATED: " + bVar2.f256523d;
                                            C87412m.m108594g(str14, "msg");
                                            C88946c.f256524a.mo122773i("MicroMsg.ZipUncompress", str14);
                                        }
                                    }
                                    String m2 = C87412m.m108600m("inFriendlyFile length=", Long.valueOf(a5.length()));
                                    C87412m.m108594g(m2, "msg");
                                    C88946c.f256524a.mo122773i("MicroMsg.ZipUncompress", m2);
                                    String m3 = C87412m.m108600m("tmpFile length=", Long.valueOf(file.length()));
                                    C87412m.m108594g(m3, "msg");
                                    C88946c.f256524a.mo122773i("MicroMsg.ZipUncompress", m3);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("uncompressor: result:");
                                    int i4 = i2;
                                    sb.append(i4);
                                    sb.append(' ');
                                    String sb4 = sb.toString();
                                    C87412m.m108594g(sb4, "msg");
                                    C88946c.f256524a.mo122773i(str13, sb4);
                                    String str15 = "filePath:" + str6 + " len:" + new File(str6).length();
                                    C87412m.m108594g(str15, "msg");
                                    C88946c.f256524a.mo122773i(str13, str15);
                                    return i4;
                                } catch (Throwable th11) {
                                    th4.addSuppressed(th11);
                                }
                                throw th4;
                            } catch (Throwable th12) {
                                C58003b.m67160a(aVar3, th4);
                                throw th4;
                            } finally {
                                th4 = th12;
                            }
                        } catch (Throwable th13) {
                            Throwable th14 = th13;
                            try {
                                throw th14;
                            } catch (Throwable th15) {
                                Throwable th16 = th15;
                                C58003b.m67160a(zipOutputStream, th14);
                                throw th16;
                            }
                        }
                    } catch (Throwable th17) {
                        Throwable th18 = th17;
                        try {
                            throw th18;
                        } catch (Throwable th19) {
                            Throwable th20 = th19;
                            C58003b.m67160a(dataInputStream2, th18);
                            throw th20;
                        }
                    }
                } catch (Throwable th21) {
                    Throwable th22 = th21;
                    try {
                        throw th22;
                    } catch (Throwable th23) {
                        Throwable th24 = th23;
                        C58003b.m67160a(dataInputStream, th22);
                        throw th24;
                    }
                }
            } catch (Throwable th25) {
                C58003b.m67160a(fileOutputStream, th);
                throw th;
            } finally {
                th = th25;
            }
        } catch (Throwable th26) {
            Throwable th27 = th26;
            try {
                throw th27;
            } catch (Throwable th28) {
                Throwable th29 = th28;
                C58003b.m67160a(zipFile, th27);
                throw th29;
            }
        }
    }
}
