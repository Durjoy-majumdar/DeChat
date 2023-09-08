package com.tencent.qqmusic.mediaplayer.codec;

import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.AudioRecognition;
import com.tencent.qqmusic.mediaplayer.NativeLibs;
import com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition;
import com.tencent.qqmusic.mediaplayer.codec.flac.FLACRecognition;
import com.tencent.qqmusic.mediaplayer.codec.wav.WavRecognition;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class MediaCodecDecoder extends BaseDecoder {
    private static final int CONTINUOUS_TIMEOUT_COUNT = 500;
    private static final String KEY_BIT_RATE = "bit-rate";
    private static final String KEY_PCM_ENCODING = "pcm-encoding";
    private static final String TAG = "MediaCodecDecoder";
    private static final long TIMEOUT_AUTO_SEEK_INTERVAL_MS = 5000;
    private static final int TIMEOUT_US = 1000;
    private WeakReference<AudioTrack> mAudioTrackRef = new WeakReference<>((Object) null);
    private long mCurrentDecodeTime = 0;
    private boolean mDecoderFinished = false;
    private long mFileSize = 0;
    private AudioInformation mInfo = null;
    private MediaCodec mMediaCodec = null;
    private final MediaExtractor mMediaExtractor = new MediaExtractor();
    private volatile byte[] mRemainBuffer = null;
    private SeekTable mSeekTable = null;

    public static class BufferTimeoutException extends Exception {
        public BufferTimeoutException() {
            super("buffer timeout exception");
        }
    }

    public static class NullInputBufferException extends Exception {
        public NullInputBufferException() {
            super("Null Input Buffer exception");
        }
    }

    private int decodeDataInternal(int i, byte[] bArr) {
        int i2 = i;
        byte[] bArr2 = bArr;
        byte[] bArr3 = this.mRemainBuffer;
        if (bArr3 == null || bArr3.length <= 0) {
            if (this.mMediaCodec == null) {
                return 0;
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int i3 = 0;
            int i4 = 0;
            while (!this.mDecoderFinished && i3 <= 0) {
                try {
                    int processInputOutputBuffer = processInputOutputBuffer(bufferInfo);
                    if (processInputOutputBuffer == -3) {
                        Logger.m21791i(TAG, "INFO_OUTPUT_BUFFERS_CHANGED");
                    } else if (processInputOutputBuffer == -2) {
                        MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
                        AudioTrack audioTrack = this.mAudioTrackRef.get();
                        if (!(audioTrack == null || outputFormat == null)) {
                            audioTrack.setPlaybackRate(outputFormat.getInteger("sample-rate"));
                        }
                        Logger.m21791i(TAG, "New format " + outputFormat);
                    } else if (processInputOutputBuffer != -1) {
                        ByteBuffer outputBuffer = this.mMediaCodec.getOutputBuffer(processInputOutputBuffer);
                        if (outputBuffer != null) {
                            i3 = Math.min(Math.min(i2, outputBuffer.remaining()), bArr2.length);
                            outputBuffer.get(bArr2, 0, i3);
                            int i5 = bufferInfo.size;
                            if (i5 > i2) {
                                int i6 = i5 - i2;
                                this.mRemainBuffer = new byte[i6];
                                outputBuffer.get(this.mRemainBuffer, 0, i6);
                            }
                            outputBuffer.clear();
                            this.mMediaCodec.releaseOutputBuffer(processInputOutputBuffer, false);
                            long j = this.mCurrentDecodeTime;
                            this.mCurrentDecodeTime = bufferInfo.presentationTimeUs / 1000;
                            AudioInformation audioInformation = this.mInfo;
                            if (audioInformation != null && audioInformation.getBitDepth() == 0) {
                                this.mInfo.setBitDept(AudioRecognition.calcBitDept((long) bufferInfo.size, this.mCurrentDecodeTime - j, this.mInfo.getChannels(), this.mInfo.getSampleRate()));
                            }
                        }
                    } else {
                        i4++;
                        Logger.m21791i(TAG, "dequeueOutputBuffer timed out!");
                        if (i4 == 500) {
                            throw new BufferTimeoutException();
                        }
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        this.mDecoderFinished = true;
                        this.mCurrentDecodeTime = getDuration();
                        Logger.m21791i(TAG, "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
                    }
                } catch (NullInputBufferException unused) {
                }
            }
            return i3;
        } else if (i2 >= bArr3.length) {
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            int length = bArr3.length;
            this.mRemainBuffer = null;
            return length;
        } else {
            System.arraycopy(bArr3, 0, bArr2, 0, i2);
            int length2 = bArr3.length - i2;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, i2, bArr4, 0, length2);
            this.mRemainBuffer = bArr4;
            return i2;
        }
    }

    public static AudioFormat.AudioType getAudioType(String str) {
        boolean z;
        AudioFormat.AudioType audioType = AudioFormat.AudioType.UNSUPPORT;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(str);
            z = true;
        } catch (Throwable th) {
            Logger.m21788e(TAG, "getAudioType", th);
            z = false;
        }
        if (!z) {
            return audioType;
        }
        FileDataSource fileDataSource = new FileDataSource(str);
        fileDataSource.open();
        AudioFormat.AudioType audioType2 = getAudioType(mediaExtractor, fileDataSource);
        fileDataSource.close();
        return audioType2;
    }

    private static MediaFormat getMediaFormatByExtractor(MediaExtractor mediaExtractor) {
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (!TextUtils.isEmpty(string) && string.startsWith("audio")) {
                return trackFormat;
            }
        }
        return null;
    }

    private boolean initAudioInformation(String str, int i, MediaFormat mediaFormat, IDataSource iDataSource, AudioFormat.AudioType audioType) {
        MediaFormat mediaFormat2;
        this.mMediaExtractor.selectTrack(i);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(str);
        this.mMediaCodec = createDecoderByType;
        createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
        this.mMediaCodec.start();
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= 500 || !(i3 == -1 || i3 == -3)) {
                mediaFormat2 = null;
            } else {
                try {
                    i3 = processInputOutputBuffer(new MediaCodec.BufferInfo());
                    if (i3 == -2) {
                        mediaFormat2 = this.mMediaCodec.getOutputFormat();
                        break;
                    }
                    i2++;
                } catch (NullInputBufferException unused) {
                }
            }
        }
        mediaFormat2 = null;
        if (mediaFormat2 != null) {
            Logger.m21791i(TAG, "format:" + mediaFormat + " outputFormat:" + mediaFormat2);
            String str2 = KEY_PCM_ENCODING;
            if (mediaFormat2.containsKey(str2)) {
                mediaFormat.setInteger(str2, mediaFormat2.getInteger(str2));
            }
            if (mediaFormat2.containsKey("sample-rate")) {
                mediaFormat.setInteger("sample-rate", mediaFormat2.getInteger("sample-rate"));
            }
            if (mediaFormat2.containsKey("channel-count")) {
                mediaFormat.setInteger("channel-count", mediaFormat2.getInteger("channel-count"));
            }
            setAudioInformationByMediaFormat(this.mInfo, mediaFormat, iDataSource.getSize());
            if (audioType == AudioFormat.AudioType.FLAC) {
                this.mSeekTable = new FlacSeekTable((int) this.mInfo.getSampleRate());
            } else if (audioType == AudioFormat.AudioType.M4A || audioType == AudioFormat.AudioType.MP4) {
                this.mSeekTable = new Mp4SeekTable();
            } else if (audioType == AudioFormat.AudioType.MP3) {
                this.mSeekTable = new Mp3SeekTable();
            }
            SeekTable seekTable = this.mSeekTable;
            if (seekTable != null) {
                try {
                    seekTable.parse(iDataSource);
                } catch (InvalidBoxException e) {
                    this.mSeekTable = null;
                    Logger.m21788e(TAG, "seek table parse", (Throwable) e);
                }
            }
            return this.mInfo.getDuration() > 0 && this.mInfo.getChannels() >= 2;
        }
        this.mMediaCodec.release();
        return false;
    }

    private boolean initMediaCodecAndFormat(IDataSource iDataSource) {
        int i = 0;
        while (i < this.mMediaExtractor.getTrackCount()) {
            MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (TextUtils.isEmpty(string) || !string.startsWith("audio")) {
                i++;
            } else {
                this.mInfo = new AudioInformation();
                AudioFormat.AudioType audioType = iDataSource.getAudioType();
                this.mInfo.setAudioType(audioType);
                setAudioType(audioType);
                return initAudioInformation(string, i, trackFormat, iDataSource, audioType);
            }
        }
        return false;
    }

    private int processInputOutputBuffer(MediaCodec.BufferInfo bufferInfo) {
        int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(1000);
        if (dequeueInputBuffer >= 0) {
            ByteBuffer inputBuffer = this.mMediaCodec.getInputBuffer(dequeueInputBuffer);
            if (inputBuffer != null) {
                int readSampleData = this.mMediaExtractor.readSampleData(inputBuffer, 0);
                if (readSampleData < 0) {
                    Logger.m21791i(TAG, "InputBuffer BUFFER_FLAG_END_OF_STREAM");
                    this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
                } else {
                    this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
                    this.mMediaExtractor.advance();
                }
            } else {
                throw new NullInputBufferException();
            }
        }
        return this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        if (r14 != 4) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void setAudioInformationByMediaFormat(com.tencent.qqmusic.mediaplayer.AudioInformation r12, android.media.MediaFormat r13, long r14) {
        /*
            java.lang.String r0 = "sample-rate"
            int r0 = r13.getInteger(r0)
            java.lang.String r1 = "channel-count"
            int r1 = r13.getInteger(r1)
            java.lang.String r2 = "bitrate"
            boolean r3 = r13.containsKey(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001d
            int r2 = r13.getInteger(r2)
            int r2 = r2 / 1000
            goto L_0x002d
        L_0x001d:
            java.lang.String r2 = "bit-rate"
            boolean r3 = r13.containsKey(r2)
            if (r3 == 0) goto L_0x002c
            int r2 = r13.getInteger(r2)
            int r2 = r2 / 1000
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            r5 = 8
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = 0
            java.lang.String r3 = "durationUs"
            if (r2 <= 0) goto L_0x004b
            boolean r9 = r13.containsKey(r3)
            if (r9 == 0) goto L_0x0044
            long r14 = r13.getLong(r3)
            long r9 = r14 / r7
            goto L_0x0063
        L_0x0044:
            long r7 = (long) r2
            long r14 = r14 / r7
            long r14 = r14 * r5
            int r15 = (int) r14
            long r9 = (long) r15
            goto L_0x0063
        L_0x004b:
            boolean r11 = r13.containsKey(r3)
            if (r11 == 0) goto L_0x0063
            long r2 = r13.getLong(r3)
            long r2 = r2 / r7
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x0061
            long r14 = r14 / r2
            long r14 = r14 * r5
            int r15 = (int) r14
            r9 = r2
            r2 = r15
            goto L_0x0063
        L_0x0061:
            r9 = r2
            r2 = 0
        L_0x0063:
            java.lang.String r14 = KEY_PCM_ENCODING
            boolean r15 = r13.containsKey(r14)
            r3 = 3
            r5 = 1
            r6 = 2
            if (r15 == 0) goto L_0x0077
            int r14 = r13.getInteger(r14)
            r15 = 4
            if (r14 == r3) goto L_0x0079
            if (r14 == r15) goto L_0x007a
        L_0x0077:
            r15 = 2
            goto L_0x007a
        L_0x0079:
            r15 = 1
        L_0x007a:
            java.lang.String r14 = "bitrate-mode"
            int r4 = r13.getInteger(r14)     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            if (r4 == r5) goto L_0x0089
            if (r4 == r6) goto L_0x0085
            goto L_0x008c
        L_0x0085:
            r12.setCbr(r5)
            goto L_0x008c
        L_0x0089:
            r12.setCbr(r3)
        L_0x008c:
            long r13 = (long) r0
            r12.setSampleRate(r13)
            r12.setChannels(r1)
            r12.setDuration(r9)
            r12.setBitrate(r2)
            r12.setBitDept(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.MediaCodecDecoder.setAudioInformationByMediaFormat(com.tencent.qqmusic.mediaplayer.AudioInformation, android.media.MediaFormat, long):void");
    }

    public int decodeData(int i, byte[] bArr) {
        long currentTime;
        try {
            return decodeDataInternal(i, bArr);
        } catch (BufferTimeoutException unused) {
            do {
                currentTime = getCurrentTime() + 5000;
                Logger.m21791i(TAG, "decodeData buffer timeout, seekTime:" + currentTime);
                seekTo((int) Math.min(getDuration(), currentTime));
                try {
                    return decodeDataInternal(i, bArr);
                } catch (BufferTimeoutException unused2) {
                    if (currentTime < getDuration()) {
                        return -1;
                    }
                }
            } while (currentTime < getDuration());
            return -1;
        }
    }

    public AudioInformation getAudioInformation() {
        return this.mInfo;
    }

    public long getBytePositionOfTime(long j) {
        int bitrate = this.mInfo.getBitrate();
        SeekTable seekTable = this.mSeekTable;
        if (seekTable != null) {
            return seekTable.seek(j);
        }
        if (bitrate > 0) {
            return j * ((long) bitrate);
        }
        if (getDuration() > 0) {
            return (this.mFileSize * j) / getDuration();
        }
        return 0;
    }

    public long getCurrentTime() {
        return this.mCurrentDecodeTime;
    }

    public long getDuration() {
        AudioInformation audioInformation = this.mInfo;
        if (audioInformation != null) {
            return audioInformation.getDuration();
        }
        return 0;
    }

    public int getErrorCodeMask() {
        return -1;
    }

    public long getMinBufferSize() {
        AudioInformation audioInformation = this.mInfo;
        if (audioInformation == null) {
            return 0;
        }
        int bitDepth = audioInformation.getBitDepth();
        int i = 4;
        if (bitDepth == 1) {
            i = 3;
        } else if (bitDepth != 4) {
            i = 2;
        }
        return (long) AudioTrack.getMinBufferSize((int) this.mInfo.getSampleRate(), 12, i);
    }

    public List<NativeLibs> getNativeLibs() {
        return new ArrayList();
    }

    public int init(INativeDataSource iNativeDataSource) {
        return -1;
    }

    public int init(String str, boolean z) {
        return init((IDataSource) new FileDataSource(str));
    }

    public int release() {
        this.mMediaExtractor.release();
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec == null) {
            return 0;
        }
        mediaCodec.release();
        return 0;
    }

    public int seekTo(int i) {
        this.mMediaCodec.flush();
        this.mRemainBuffer = null;
        this.mMediaExtractor.seekTo((long) (i * 1000), 2);
        this.mCurrentDecodeTime = (long) i;
        return i;
    }

    public void setAudioTrack(AudioTrack audioTrack) {
        this.mAudioTrackRef = new WeakReference<>(audioTrack);
    }

    public int init(final IDataSource iDataSource) {
        if (iDataSource == null) {
            return -1;
        }
        try {
            iDataSource.open();
            this.mMediaExtractor.setDataSource(new MediaDataSource() {
                public void close() {
                }

                public long getSize() {
                    return iDataSource.getSize();
                }

                public int readAt(long j, byte[] bArr, int i, int i2) {
                    return iDataSource.readAt(j, bArr, i, i2);
                }
            });
            this.mFileSize = iDataSource.getSize();
            if (initMediaCodecAndFormat(iDataSource)) {
                return 0;
            }
            return -1;
        } catch (Throwable th) {
            Logger.m21788e(TAG, APMidasPluginInfo.LAUNCH_INTERFACE_INIT, th);
            return -1;
        }
    }

    private static AudioFormat.AudioType getAudioType(MediaExtractor mediaExtractor, IDataSource iDataSource) {
        AudioFormat.AudioType audioType = AudioFormat.AudioType.UNSUPPORT;
        MediaFormat mediaFormatByExtractor = getMediaFormatByExtractor(mediaExtractor);
        if (mediaFormatByExtractor == null) {
            return audioType;
        }
        String string = mediaFormatByExtractor.getString("mime");
        if (TextUtils.isEmpty(string) || !string.startsWith("audio")) {
            return audioType;
        }
        char c = 65535;
        switch (string.hashCode()) {
            case -1003765268:
                if (string.equals(MimeTypes.AUDIO_VORBIS)) {
                    c = 0;
                    break;
                }
                break;
            case -53558318:
                if (string.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                break;
            case 187094639:
                if (string.equals(MimeTypes.AUDIO_RAW)) {
                    c = 2;
                    break;
                }
                break;
            case 1504619009:
                if (string.equals(MimeTypes.AUDIO_FLAC)) {
                    c = 3;
                    break;
                }
                break;
            case 1504831518:
                if (string.equals(MimeTypes.AUDIO_MPEG)) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return AudioFormat.AudioType.OGG;
            case 1:
                if (FfmpegRecognition.isM4a(iDataSource)) {
                    return AudioFormat.AudioType.M4A;
                }
                return audioType;
            case 2:
                if (FLACRecognition.isFlac(iDataSource)) {
                    return AudioFormat.AudioType.FLAC;
                }
                if (WavRecognition.isWav(iDataSource)) {
                    return AudioFormat.AudioType.WAV;
                }
                return audioType;
            case 3:
                return AudioFormat.AudioType.FLAC;
            case 4:
                return AudioFormat.AudioType.MP3;
            default:
                return audioType;
        }
    }
}
