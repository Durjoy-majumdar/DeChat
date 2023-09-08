package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.media.MediaPlayer;
import com.tencent.p014mm.sdk.platformtools.PlaySoundNew;

/* renamed from: com.tencent.mm.sdk.platformtools.PlaySound */
public class PlaySound {
    private static final String TAG = "MicroMsg.PlaySound";
    public static boolean isEnablePlaySoundNew = true;

    /* renamed from: com.tencent.mm.sdk.platformtools.PlaySound$SPEAKERON */
    public enum SPEAKERON {
        NOTSET,
        ON,
        OFF
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.PlaySound$OnPlayCompletionListener */
    public interface OnPlayCompletionListener {
        void onCompletion();
    }

    public static void play(Context context, int i, boolean z, boolean z2, final OnPlayCompletionListener onPlayCompletionListener) {
        if (!isEnablePlaySoundNew) {
            playRoot(context, i, z ? SPEAKERON.ON : SPEAKERON.OFF, z2, onPlayCompletionListener);
        } else {
            PlaySoundNew.play(context, i, z, z2, (PlaySoundNew.OnPlayCompletionListener) new PlaySoundNew.OnPlayCompletionListener() {
                public void onCompletion() {
                    OnPlayCompletionListener onPlayCompletionListener = OnPlayCompletionListener.this;
                    if (onPlayCompletionListener != null) {
                        onPlayCompletionListener.onCompletion();
                    }
                }
            });
        }
    }

    public static void playLoop(Context context, int i, int i2) {
        if (!isEnablePlaySoundNew) {
            playRoot(context, i, SPEAKERON.NOTSET, i2, true, (OnPlayCompletionListener) null);
            return;
        }
        PlaySoundNew.playRootTP(context, i, PlaySoundNew.SPEAKERON.NOTSET, i2, false, (PlaySoundNew.OnPlayCompletionListener) null);
    }

    public static MediaPlayer playReturn(Context context, int i, boolean z, OnPlayCompletionListener onPlayCompletionListener) {
        return playRoot(context, i, z ? SPEAKERON.ON : SPEAKERON.OFF, false, onPlayCompletionListener);
    }

    public static MediaPlayer playRoot(Context context, int i, SPEAKERON speakeron, boolean z, OnPlayCompletionListener onPlayCompletionListener) {
        return playRoot(context, i, speakeron, -1, z, onPlayCompletionListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a A[SYNTHETIC, Splitter:B:52:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0119 A[SYNTHETIC, Splitter:B:57:0x0119] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaPlayer playRoot(android.content.Context r19, int r20, com.tencent.p014mm.sdk.platformtools.PlaySound.SPEAKERON r21, int r22, boolean r23, com.tencent.p014mm.sdk.platformtools.PlaySound.OnPlayCompletionListener r24) {
        /*
            r0 = r21
            r1 = r22
            r2 = r24
            java.lang.String r3 = ""
            r4 = 4
            r5 = 5
            r7 = 3
            r8 = 2
            r9 = 1
            java.lang.String r10 = "MicroMsg.PlaySound"
            r11 = 0
            if (r19 == 0) goto L_0x0125
            if (r0 != 0) goto L_0x0016
            goto L_0x0125
        L_0x0016:
            java.lang.String r12 = r19.getString(r20)
            android.media.MediaPlayer r15 = new android.media.MediaPlayer
            r15.<init>()
            com.tencent.mm.sdk.platformtools.PlaySound$SPEAKERON r13 = com.tencent.p014mm.sdk.platformtools.PlaySound.SPEAKERON.NOTSET
            r14 = -1
            if (r0 == r13) goto L_0x0032
            if (r14 != r1) goto L_0x0032
            com.tencent.mm.sdk.platformtools.PlaySound$SPEAKERON r1 = com.tencent.p014mm.sdk.platformtools.PlaySound.SPEAKERON.ON
            if (r0 != r1) goto L_0x002c
            r1 = 3
            goto L_0x002e
        L_0x002c:
            r1 = 8
        L_0x002e:
            r15.setAudioStreamType(r1)
            goto L_0x0037
        L_0x0032:
            if (r1 == r14) goto L_0x0037
            r15.setAudioStreamType(r1)
        L_0x0037:
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r13 = r15.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r1[r11] = r13
            r1[r9] = r12
            r1[r8] = r19
            java.lang.Integer r13 = java.lang.Integer.valueOf(r20)
            r1[r7] = r13
            r1[r4] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r1[r5] = r0
            r0 = 6
            r1[r0] = r2
            java.lang.String r0 = "play start mp:%d path:%s context:%s pathId:%d speakerOn:%s looping:%b listener:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r1)
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch:{ Exception -> 0x00e8, all -> 0x00e4 }
            android.content.res.AssetFileDescriptor r1 = r0.openFd(r12)     // Catch:{ Exception -> 0x00e8, all -> 0x00e4 }
            java.io.FileDescriptor r14 = r1.getFileDescriptor()     // Catch:{ Exception -> 0x00df }
            long r4 = r1.getStartOffset()     // Catch:{ Exception -> 0x00df }
            long r17 = r1.getLength()     // Catch:{ Exception -> 0x00df }
            r13 = r15
            r6 = r15
            r15 = r4
            r13.setDataSource(r14, r15, r17)     // Catch:{ Exception -> 0x00d7 }
            r13 = r23
            r6.setLooping(r13)     // Catch:{ Exception -> 0x00d7 }
            com.tencent.mm.sdk.platformtools.PlaySound$1 r0 = new com.tencent.mm.sdk.platformtools.PlaySound$1     // Catch:{ Exception -> 0x00d7 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00d7 }
            r6.setOnErrorListener(r0)     // Catch:{ Exception -> 0x00d7 }
            com.tencent.mm.sdk.platformtools.PlaySound$2 r0 = new com.tencent.mm.sdk.platformtools.PlaySound$2     // Catch:{ Exception -> 0x00d7 }
            r0.<init>(r12, r6, r2)     // Catch:{ Exception -> 0x00d7 }
            r6.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x00d7 }
            com.tencent.mm.sdk.platformtools.PlaySound$3 r0 = new com.tencent.mm.sdk.platformtools.PlaySound$3     // Catch:{ Exception -> 0x00d7 }
            r14 = r20
            r0.<init>(r12, r6, r14)     // Catch:{ Exception -> 0x00d5 }
            r6.setOnPreparedListener(r0)     // Catch:{ Exception -> 0x00d5 }
            r6.prepareAsync()     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = "play start mp finish [%d], myLooper[%b] mainLooper[%b]"
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00d5 }
            int r4 = r6.hashCode()     // Catch:{ Exception -> 0x00d5 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00d5 }
            r2[r11] = r4     // Catch:{ Exception -> 0x00d5 }
            android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00d5 }
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x00d5 }
            r2[r9] = r4     // Catch:{ Exception -> 0x00d5 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00d5 }
            if (r4 == 0) goto L_0x00bf
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x00d5 }
            r2[r8] = r4     // Catch:{ Exception -> 0x00d5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r0, r2)     // Catch:{ Exception -> 0x00d5 }
            r1.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00d4
        L_0x00cd:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r1, r3, r0)
        L_0x00d4:
            return r6
        L_0x00d5:
            r0 = move-exception
            goto L_0x00ed
        L_0x00d7:
            r0 = move-exception
            r14 = r20
            goto L_0x00ed
        L_0x00db:
            r0 = move-exception
            r6 = r1
            r1 = r0
            goto L_0x0117
        L_0x00df:
            r0 = move-exception
            r14 = r20
            r6 = r15
            goto L_0x00ed
        L_0x00e4:
            r0 = move-exception
            r1 = r0
            r6 = 0
            goto L_0x0117
        L_0x00e8:
            r0 = move-exception
            r14 = r20
            r6 = r15
            r1 = 0
        L_0x00ed:
            java.lang.String r2 = "play failed pathId:%d e:%s"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ all -> 0x00db }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x00db }
            r4[r11] = r5     // Catch:{ all -> 0x00db }
            java.lang.String r5 = r0.getMessage()     // Catch:{ all -> 0x00db }
            r4[r9] = r5     // Catch:{ all -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r4)     // Catch:{ all -> 0x00db }
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r3, r2)     // Catch:{ all -> 0x00db }
            r6.release()     // Catch:{ all -> 0x00db }
            if (r1 == 0) goto L_0x0115
            r1.close()     // Catch:{ IOException -> 0x010e }
            goto L_0x0115
        L_0x010e:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r1, r3, r0)
        L_0x0115:
            r1 = 0
            return r1
        L_0x0117:
            if (r6 == 0) goto L_0x0124
            r6.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x0124
        L_0x011d:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r2, r3, r0)
        L_0x0124:
            throw r1
        L_0x0125:
            r14 = r20
            r13 = r23
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r11] = r19
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r1[r9] = r3
            r1[r8] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r23)
            r1[r7] = r0
            r1[r4] = r2
            java.lang.String r0 = "play Err context:%s pathId:%d speekeron:%s looping:%b listener:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.PlaySound.playRoot(android.content.Context, int, com.tencent.mm.sdk.platformtools.PlaySound$SPEAKERON, int, boolean, com.tencent.mm.sdk.platformtools.PlaySound$OnPlayCompletionListener):android.media.MediaPlayer");
    }

    public static void play(Context context, int i, boolean z, final OnPlayCompletionListener onPlayCompletionListener) {
        if (!isEnablePlaySoundNew) {
            playRoot(context, i, z ? SPEAKERON.ON : SPEAKERON.OFF, false, onPlayCompletionListener);
        } else {
            PlaySoundNew.play(context, i, z, false, (PlaySoundNew.OnPlayCompletionListener) new PlaySoundNew.OnPlayCompletionListener() {
                public void onCompletion() {
                    OnPlayCompletionListener onPlayCompletionListener = OnPlayCompletionListener.this;
                    if (onPlayCompletionListener != null) {
                        onPlayCompletionListener.onCompletion();
                    }
                }
            });
        }
    }

    public static void play(Context context, int i, final OnPlayCompletionListener onPlayCompletionListener) {
        if (!isEnablePlaySoundNew) {
            playRoot(context, i, SPEAKERON.NOTSET, false, onPlayCompletionListener);
        } else {
            PlaySoundNew.play(context, i, PlaySoundNew.SPEAKERON.NOTSET, false, (PlaySoundNew.OnPlayCompletionListener) new PlaySoundNew.OnPlayCompletionListener() {
                public void onCompletion() {
                    OnPlayCompletionListener onPlayCompletionListener = OnPlayCompletionListener.this;
                    if (onPlayCompletionListener != null) {
                        onPlayCompletionListener.onCompletion();
                    }
                }
            });
        }
    }

    public static void play(Context context, int i) {
        if (!isEnablePlaySoundNew) {
            playRoot(context, i, SPEAKERON.NOTSET, false, (OnPlayCompletionListener) null);
        } else {
            PlaySoundNew.play(context, i, PlaySoundNew.SPEAKERON.NOTSET, false, (PlaySoundNew.OnPlayCompletionListener) null);
        }
    }

    public static void play(Context context, int i, int i2) {
        if (!isEnablePlaySoundNew) {
            playRoot(context, i, SPEAKERON.NOTSET, i2, false, (OnPlayCompletionListener) null);
            return;
        }
        PlaySoundNew.playRootTP(context, i, PlaySoundNew.SPEAKERON.NOTSET, i2, false, (PlaySoundNew.OnPlayCompletionListener) null);
    }
}
