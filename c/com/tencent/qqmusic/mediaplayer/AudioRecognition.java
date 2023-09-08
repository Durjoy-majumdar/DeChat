package com.tencent.qqmusic.mediaplayer;

import android.media.AudioTrack;
import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.codec.BaseDecoder;
import com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class AudioRecognition {
    private static final int READ_FILE_HEADER_SIZE = 64;
    private static String TAG = "AudioRecognition";
    private static HashMap<String, AudioFormat.AudioType> mGuessFormatResultCache = new HashMap<>();
    private static HashMap<String, AudioFormat.AudioType> mRecognitionResultCache = new HashMap<>();

    public static int calcBitDept(long j, long j2, int i, long j3) {
        if (0 == j2 || i == 0) {
            return 0;
        }
        double d = (double) ((((float) j) * 1000.0f) / ((float) ((((long) i) * j2) * j3)));
        int round = (int) Math.round(d);
        String str = TAG;
        Logger.m21791i(str, "byteNumbers = " + j + ",time = " + j2 + ",channels = " + i + ",sampleRate = " + j3 + ",bitDept = " + d);
        return round;
    }

    public static int getAudioBitDept(BaseDecoder baseDecoder, AudioInformation audioInformation) {
        int i = 0;
        boolean z = audioInformation.getAudioType() == AudioFormat.AudioType.FLAC;
        if (z) {
            try {
                i = (int) baseDecoder.getMinBufferSize();
            } catch (Throwable th) {
                Logger.m21790e(TAG, th);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize((int) audioInformation.getSampleRate(), audioInformation.getChannels(), 2);
        if (!z) {
            if (minBufferSize % 2048 != 0) {
                minBufferSize = ((minBufferSize / 2048) + 1) * 2048;
            }
            i = minBufferSize;
        }
        int decodeData = baseDecoder.decodeData(i, new byte[i]);
        if (decodeData <= 0) {
            decodeData = i * 2;
        }
        return calcBitDept((long) decodeData, baseDecoder.getCurrentTime(), audioInformation.getChannels(), audioInformation.getSampleRate());
    }

    public static NativeDecoder getDecoderFormFile(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        NativeDecoder nativeDecoder = new NativeDecoder();
        if (nativeDecoder.init(str, false) == 0) {
            return nativeDecoder;
        }
        return null;
    }

    public static AudioFormat.AudioType guessFormat(String str) {
        HashMap<String, AudioFormat.AudioType> hashMap = mGuessFormatResultCache;
        if (hashMap != null && hashMap.containsKey(str)) {
            return mGuessFormatResultCache.get(str);
        }
        Iterator<AudioFormat.AudioType> it = MediaCodecFactory.getSupportAudioType().iterator();
        while (it.hasNext()) {
            IAudioRecognition createDecoderByType = MediaCodecFactory.createDecoderByType(it.next());
            if (createDecoderByType != null) {
                AudioFormat.AudioType guessAudioType = createDecoderByType.guessAudioType(str);
                if (AudioFormat.isAudioType(guessAudioType)) {
                    mGuessFormatResultCache.put(str, guessAudioType);
                    return guessAudioType;
                }
            }
        }
        return AudioFormat.AudioType.UNSUPPORT;
    }

    public static AudioFormat.AudioType recognitionAudioFormatByExtensions(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (mRecognitionResultCache.containsKey(str)) {
            AudioFormat.AudioType audioType = mRecognitionResultCache.get(str);
            String str2 = TAG;
            Logger.m21793w(str2, "Get from cache " + audioType + ",filepath = " + str + ",retType = " + audioType);
            return audioType;
        }
        AudioFormat.AudioType guessFormat = guessFormat(str);
        if (!AudioFormat.isAudioType(guessFormat)) {
            String str3 = TAG;
            Logger.m21791i(str3, "recognitionAudioFormatByExtensions guessAudioType = null,so recognitionAudioFormatExactly filepath = " + str);
            try {
                guessFormat = recognitionAudioFormatExactly(str);
            } catch (IOException e) {
                Logger.m21790e(TAG, (Throwable) e);
            }
        }
        String str4 = TAG;
        Logger.m21791i(str4, "recognitionAudioFormatByExtensions filepath = " + str + ",guessAudioType = " + guessFormat);
        return guessFormat;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r0v17, types: [byte[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00da A[SYNTHETIC, Splitter:B:38:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014d A[SYNTHETIC, Splitter:B:56:0x014d] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0158 A[EDGE_INSN: B:71:0x0158->B:61:0x0158 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType recognitionAudioFormatExactly(java.lang.String r14) {
        /*
            r0 = 0
            if (r14 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.HashMap<java.lang.String, com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType> r1 = mGuessFormatResultCache
            r1.remove(r14)
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "recognitionAudioFormatExactly  path = "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r1, r2)
            java.io.File r1 = new java.io.File
            r1.<init>(r14)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x01c0
            boolean r2 = r1.canRead()
            if (r2 == 0) goto L_0x01a9
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "recognitionAudioFormatExactly file length = "
            r3.append(r4)
            long r4 = r1.length()
            r3.append(r4)
            java.lang.String r1 = r3.toString()
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r3 = guessFormat(r14)
            java.util.ArrayList r4 = com.tencent.qqmusic.mediaplayer.MediaCodecFactory.getSupportAudioType()
            r5 = 0
            if (r3 == 0) goto L_0x0075
            boolean r6 = r4.contains(r3)
            if (r6 == 0) goto L_0x0075
            r4.remove(r3)
            r4.add(r5, r3)
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r6 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x0075
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r6 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC
            r4.remove(r6)
            r4.add(r5, r6)
        L_0x0075:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r6 = com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.getAudioType(r14)
            boolean r7 = com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(r6)
            if (r7 != 0) goto L_0x0158
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00d0 }
            r7.<init>(r14)     // Catch:{ Exception -> 0x00d0 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            int r9 = r7.read(r8)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            r10 = 64
            if (r9 < r10) goto L_0x0095
            byte[] r0 = new byte[r10]     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            java.lang.System.arraycopy(r8, r5, r0, r5, r10)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
        L_0x0095:
            java.lang.String r10 = TAG     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            r11.<init>()     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            java.lang.String r12 = "recognitionAudioFormatExactly header = "
            r11.append(r12)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            java.lang.String r12 = new java.lang.String     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            r12.<init>(r8, r5, r9)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            java.lang.String r5 = ",path = "
            r11.append(r5)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            r11.append(r14)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            java.lang.String r5 = r11.toString()     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r10, r5)     // Catch:{ Exception -> 0x00c7, all -> 0x00c3 }
            r7.close()     // Catch:{ Exception -> 0x00bc }
            goto L_0x00e5
        L_0x00bc:
            r5 = move-exception
            java.lang.String r7 = TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r7, (java.lang.Throwable) r5)
            goto L_0x00e5
        L_0x00c3:
            r14 = move-exception
            r0 = r7
            goto L_0x014b
        L_0x00c7:
            r5 = move-exception
            r13 = r5
            r5 = r0
            r0 = r7
            r7 = r13
            goto L_0x00d3
        L_0x00cd:
            r14 = move-exception
            goto L_0x014b
        L_0x00d0:
            r5 = move-exception
            r7 = r5
            r5 = r0
        L_0x00d3:
            java.lang.String r8 = TAG     // Catch:{ all -> 0x00cd }
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r8, (java.lang.Throwable) r7)     // Catch:{ all -> 0x00cd }
            if (r0 == 0) goto L_0x00e4
            r0.close()     // Catch:{ Exception -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r0 = move-exception
            java.lang.String r7 = TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r7, (java.lang.Throwable) r0)
        L_0x00e4:
            r0 = r5
        L_0x00e5:
            java.util.Iterator r4 = r4.iterator()
        L_0x00e9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0158
            java.lang.Object r5 = r4.next()
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = (com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType) r5
            com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition r5 = com.tencent.qqmusic.mediaplayer.MediaCodecFactory.createDecoderByType(r5)
            if (r5 == 0) goto L_0x00e9
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = r5.getAudioType(r14, r0)     // Catch:{ SoNotFindException -> 0x0100 }
            goto L_0x010b
        L_0x0100:
            r5 = move-exception
            java.lang.String r7 = TAG
            java.lang.String r8 = "so not find!"
            com.tencent.qqmusic.mediaplayer.util.Logger.m21788e((java.lang.String) r7, (java.lang.String) r8, (java.lang.Throwable) r5)
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
        L_0x010b:
            boolean r7 = com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(r5)
            if (r7 == 0) goto L_0x00e9
            java.lang.String r0 = TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "soft recognition  = "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r6 = ",file path = "
            r4.append(r6)
            r4.append(r14)
            java.lang.String r6 = ",recognition time = "
            r4.append(r6)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            r4.append(r6)
            java.lang.String r1 = ",guess file format = "
            r4.append(r1)
            boolean r1 = r5.equals(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.qqmusic.mediaplayer.util.Logger.m21793w(r0, r1)
            r6 = r5
            goto L_0x0158
        L_0x014b:
            if (r0 == 0) goto L_0x0157
            r0.close()     // Catch:{ Exception -> 0x0151 }
            goto L_0x0157
        L_0x0151:
            r0 = move-exception
            java.lang.String r1 = TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.m21790e((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x0157:
            throw r14
        L_0x0158:
            if (r6 != 0) goto L_0x015d
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r6 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
            goto L_0x018a
        L_0x015d:
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[recognitionAudioFormatExactly] add to cache, file path checkFilePath = ["
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = "]. retType = ["
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = "]."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r1)
            java.util.HashMap<java.lang.String, com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType> r0 = mRecognitionResultCache
            r0.put(r14, r6)
            java.util.HashMap<java.lang.String, com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType> r0 = mGuessFormatResultCache
            r0.put(r14, r6)
        L_0x018a:
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "recognitionAudioFormatExactly checkFilePath = "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = ",retType = "
            r1.append(r14)
            r1.append(r6)
            java.lang.String r14 = r1.toString()
            com.tencent.qqmusic.mediaplayer.util.Logger.m21791i(r0, r14)
            return r6
        L_0x01a9:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not read file :"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x01c0:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File not found :"
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.AudioRecognition.recognitionAudioFormatExactly(java.lang.String):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }
}
