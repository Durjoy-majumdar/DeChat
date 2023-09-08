package z24;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: z24.a */
public class C91604a implements C91607c {

    /* renamed from: z24.a$a */
    public static class C91605a {

        /* renamed from: a */
        public ZipFile f262446a;

        /* renamed from: b */
        public ZipEntry f262447b;

        public C91605a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f262446a = zipFile;
            this.f262447b = zipEntry;
        }
    }

    /* renamed from: a */
    public final void mo125475a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public final C91605a mo125476b(Context context, String[] strArr, String str, C91609f fVar) {
        String[] strArr2;
        String[] strArr3 = strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr4 = applicationInfo.splitSourceDirs;
        char c = 0;
        int i = 1;
        if (strArr4 == null || strArr4.length == 0) {
            strArr2 = new String[]{applicationInfo.sourceDir};
        } else {
            strArr2 = new String[(strArr4.length + 1)];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr4, 0, strArr2, 1, strArr4.length);
        }
        int length = strArr2.length;
        ZipFile zipFile = null;
        int i2 = 0;
        while (i2 < length) {
            String str2 = strArr2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), i);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                C91609f fVar2 = fVar;
            } else {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        int length2 = strArr3.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            String str4 = "lib" + File.separatorChar + strArr3[i7] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str4;
                            objArr[i] = str2;
                            fVar.mo125480d("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str4);
                            if (entry != null) {
                                return new C91605a(zipFile, entry);
                            }
                            i7++;
                            c = 0;
                            i = 1;
                        }
                        String str5 = str;
                        C91609f fVar3 = fVar;
                        i5 = i6;
                        i = 1;
                    } else {
                        String str6 = str;
                        C91609f fVar4 = fVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
            c = 0;
            i = 1;
        }
        return null;
    }
}
