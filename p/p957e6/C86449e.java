package p957e6;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p957e6.C86446d;

/* renamed from: e6.e */
public abstract class C86449e implements C86443a {

    /* renamed from: a */
    public final ExecutorService f251239a = Executors.newSingleThreadExecutor();

    /* renamed from: e6.e$a */
    public class C86450a implements Callable<Void> {

        /* renamed from: d */
        public final File f251240d;

        public C86450a(File file) {
            this.f251240d = file;
        }

        public Object call() {
            C86449e eVar = C86449e.this;
            File file = this.f251240d;
            eVar.getClass();
            long j = 0;
            if (file.exists()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (!file.setLastModified(currentTimeMillis)) {
                    long length = file.length();
                    if (length != 0) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
                        long j2 = length - 1;
                        randomAccessFile.seek(j2);
                        byte readByte = randomAccessFile.readByte();
                        randomAccessFile.seek(j2);
                        randomAccessFile.write(readByte);
                        randomAccessFile.close();
                    } else if (!file.delete() || !file.createNewFile()) {
                        throw new IOException("Error recreate zero-size file " + file);
                    }
                    if (file.lastModified() < currentTimeMillis) {
                        String.format("Last modified date %s is not set for file %s", new Object[]{new Date(file.lastModified()), file.getAbsolutePath()});
                    }
                }
            }
            File parentFile = file.getParentFile();
            List<File> linkedList = new LinkedList<>();
            File[] listFiles = parentFile.listFiles();
            if (listFiles != null) {
                linkedList = Arrays.asList(listFiles);
                Collections.sort(linkedList, new C86446d.C86448b((C86446d.C86447a) null));
            }
            for (File length2 : linkedList) {
                j += length2.length();
            }
            linkedList.size();
            for (File file2 : linkedList) {
                if (!(j <= ((C86452g) eVar).f251242b)) {
                    long length3 = file2.length();
                    if (file2.delete()) {
                        j -= length3;
                        file2.toString();
                    } else {
                        file2.toString();
                    }
                }
            }
            return null;
        }
    }
}
