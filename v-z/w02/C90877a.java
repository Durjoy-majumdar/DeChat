package w02;

import com.tencent.p014mm.patchligthdiff.hdiff.HPatch;
import com.tencent.p014mm.sdk.platformtools.Log;
import cv3.C86144a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: w02.a */
public class C90877a extends C86144a {
    /* renamed from: a */
    public int mo120560a(InputStream inputStream, InputStream inputStream2, File file) {
        String absolutePath = file.getAbsolutePath();
        String str = File.separator;
        new File(absolutePath.substring(0, absolutePath.lastIndexOf(str))).mkdirs();
        String substring = file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(str));
        String str2 = substring + str + "old_" + file.getName();
        String str3 = substring + str + "diff_" + file.getName();
        File file2 = new File(str2);
        File file3 = new File(str3);
        file2.createNewFile();
        file3.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (read == -1) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
        }
        fileOutputStream.close();
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
        byte[] bArr2 = new byte[8192];
        while (true) {
            int read2 = inputStream2.read(bArr2, 0, 8192);
            if (read2 != -1) {
                fileOutputStream2.write(bArr2, 0, read2);
            } else {
                fileOutputStream2.close();
                int patch = HPatch.patch(file2.getAbsolutePath(), file3.getAbsolutePath(), file.getAbsolutePath(), 262144);
                Log.m105925i("MicroMsg.HDiffFilePatch", "%s:  res:%s, oldSize:%s, diffSize:%s, newSize:%s", file.getName(), Integer.valueOf(patch), Long.valueOf(file2.length()), Long.valueOf(file3.length()), Long.valueOf(file.length()));
                file2.delete();
                file3.delete();
                return patch;
            }
        }
    }
}
