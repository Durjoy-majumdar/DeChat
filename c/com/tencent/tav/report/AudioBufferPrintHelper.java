package com.tencent.tav.report;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AudioBufferPrintHelper {
    public static final boolean CLEAR_MODE = false;
    public static final boolean ENABLE = false;
    public static final String SDCARD_TAVKIT_DEMO_INFO = "/sdcard/tavkit_demo/info/";
    private static final String TAG = "DebugUtils";
    private boolean enable = false;
    private List<String> list = new ArrayList();
    private int maxPrintCount = 0;
    private long startIndex = 0;
    private String startName = "";
    private long startTimeMs = 0;
    private long waitMs;

    public static class Instance {
        /* access modifiers changed from: private */
        public static AudioBufferPrintHelper INSTANCE = new AudioBufferPrintHelper();

        private Instance() {
        }
    }

    public static void clearFiles() {
    }

    public static ByteBuffer clone(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        byteBuffer.rewind();
        allocate.flip();
        return allocate;
    }

    public static File createNewFile(String str, String str2) {
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        File file2 = new File(file, str2);
        try {
            boolean delete = file2.delete();
            if (file2.createNewFile()) {
                return file2;
            }
            file2.getAbsolutePath();
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    private static void deleteAllFiles(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    deleteAllFiles(file2);
                    file2.delete();
                } else if (file2.exists()) {
                    deleteAllFiles(file2);
                    file2.delete();
                }
            }
        }
    }

    public static AudioBufferPrintHelper getInstance() {
        return Instance.INSTANCE;
    }

    private void initFlag(int i) {
        if (this.startTimeMs == 0) {
            this.startTimeMs = System.currentTimeMillis();
            this.startName = new SimpleDateFormat("HHmmss").format(new Date(this.startTimeMs));
        }
        if (this.maxPrintCount == 0) {
            this.maxPrintCount = i;
        }
    }

    public static void reset() {
        AudioBufferPrintHelper unused = Instance.INSTANCE = new AudioBufferPrintHelper();
    }

    public void printByteBuffer(String str, ByteBuffer byteBuffer) {
    }

    public void printByteBuffer(String str, ShortBuffer shortBuffer) {
    }

    public void printByteBuffer(String str, short[] sArr) {
    }

    public void startDelay(long j) {
        startDelay(j, 100);
    }

    public void startIgnoreBegin(int i) {
        startIgnoreBegin(i, 100);
    }

    public void startDelay(long j, int i) {
        initFlag(i);
        boolean z = System.currentTimeMillis() >= this.startTimeMs + j;
        this.enable = z;
        if (z) {
            int i2 = this.maxPrintCount;
            this.maxPrintCount = i2 - 1;
            if (i2 < 0) {
                this.enable = false;
            }
        }
    }

    public void startIgnoreBegin(int i, int i2) {
        initFlag(i2);
        long j = this.startIndex;
        this.startIndex = 1 + j;
        if (j > ((long) i)) {
            this.enable = true;
        }
        if (this.enable) {
            int i3 = this.maxPrintCount;
            this.maxPrintCount = i3 - 1;
            if (i3 < 0) {
                this.enable = false;
            }
        }
    }

    public static ShortBuffer clone(ShortBuffer shortBuffer) {
        ShortBuffer allocate = ShortBuffer.allocate(shortBuffer.capacity());
        shortBuffer.rewind();
        allocate.put(shortBuffer);
        shortBuffer.rewind();
        allocate.flip();
        return allocate;
    }
}
