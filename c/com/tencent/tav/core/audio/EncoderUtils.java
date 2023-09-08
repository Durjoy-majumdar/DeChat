package com.tencent.tav.core.audio;

import com.tencent.tav.decoder.logger.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;

class EncoderUtils {
    private static final int FREQ_IDX = 4;
    public static final int INDEX_START = 1;
    private static final int PROFILE = 2;

    public static void addADTStoPacket(byte[] bArr, int i) {
        byte[] generateADTSHeader = generateADTSHeader(bArr.length, i);
        System.arraycopy(generateADTSHeader, 0, bArr, 0, generateADTSHeader.length);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void deleteAllTmpFiles(String str, int i, String str2) {
        Logger.m144641d("EncoderUtils", "deleteAllTmpFiles " + i + " sessionId = " + str2);
        for (int i2 = 1; i2 <= i; i2++) {
            File file = new File(getAudioOutSaveFilePath(str, i2, str2));
            boolean delete = file.delete();
            Logger.m144641d("EncoderUtils", "delete file " + file.getAbsolutePath() + " deleteResult = " + delete);
        }
    }

    public static byte[] generateADTSHeader(int i, int i2) {
        return new byte[]{-1, -7, (byte) ((i2 >> 2) + 80), (byte) (((i2 & 3) << 6) + (i >> 11)), (byte) ((i & 2047) >> 3), (byte) (((i & 7) << 5) + 31), -4};
    }

    public static String getAudioOutSaveFilePath(String str, int i, String str2) {
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf > 0) {
            return str.substring(0, lastIndexOf) + "_" + str2 + "_" + i + str.substring(lastIndexOf);
        }
        return str + "_" + str2 + "_" + i;
    }

    private static boolean isValidFile(File file) {
        return file.createNewFile() || (file.exists() && file.isFile());
    }

    public static boolean mergeAllFiles(String str, int i, String str2) {
        Logger.m144641d("EncoderUtils", "mergeAllFiles " + i + " sessionId = " + str2);
        try {
            File file = new File(str);
            file.delete();
            if (!isValidFile(file)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            for (int i2 = 1; i2 <= i; i2++) {
                randomAccessFile.write(readFromFile(getAudioOutSaveFilePath(str, i2, str2)));
            }
            close(randomAccessFile);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static byte[] readFromFile(String str) {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return bArr;
        } finally {
            close(fileInputStream);
        }
    }
}
