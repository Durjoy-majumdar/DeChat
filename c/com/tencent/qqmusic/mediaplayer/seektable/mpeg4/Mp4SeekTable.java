package com.tencent.qqmusic.mediaplayer.seektable.mpeg4;

import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Co64;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Mdhd;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stco;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsc;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stsz;
import com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.Stts;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Mp4SeekTable implements SeekTable {
    private final Map<String, IMpeg4Box> essentialStblChunkMap;
    private final Mdhd mdhd = new Mdhd();

    public interface Function1<T, R> {
        R call(T t);
    }

    public Mp4SeekTable() {
        HashMap hashMap = new HashMap();
        this.essentialStblChunkMap = hashMap;
        hashMap.put("stco", new Stco());
        hashMap.put("co64", new Co64());
        hashMap.put("stts", new Stts());
        hashMap.put("stsc", new Stsc());
        hashMap.put("stsz", new Stsz());
    }

    private static void chunkOfSample(Stsc stsc, int i, int[] iArr) {
        boolean z;
        int entryCount = stsc.getEntryCount();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = stsc.getFirstChunk()[i2];
            int i7 = ((i6 - i3) * i4) + i5;
            if (i >= i7) {
                i4 = stsc.getSamplesPerChunk()[i2];
                if (i2 < entryCount) {
                    i2++;
                    i5 = i7;
                }
                i3 = i6;
                if (i2 >= entryCount) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        int i8 = i4 != 0 ? z ? ((i - i5) / i4) + i3 : i3 : 1;
        iArr[0] = i8;
        iArr[1] = i5 + ((i8 - i3) * i4);
    }

    /* access modifiers changed from: private */
    public static boolean needMoreChunks(HashSet<String> hashSet) {
        if (hashSet.size() > 2) {
            return true;
        }
        return hashSet.contains("stco") && hashSet.contains("co64");
    }

    private static long offset64OfChunk(Co64 co64, int i) {
        if (i > co64.getEntryCount()) {
            return co64.getChunkOffset()[co64.getEntryCount() - 1];
        }
        if (co64.getEntryCount() > 0) {
            return co64.getChunkOffset()[i - 1];
        }
        return 8;
    }

    private static int offsetOfChunk(Stco stco, int i) {
        if (i > stco.getEntryCount()) {
            return stco.getChunkOffset()[stco.getEntryCount() - 1];
        }
        if (stco.getEntryCount() > 0) {
            return stco.getChunkOffset()[i - 1];
        }
        return 8;
    }

    private static int offsetOfSampleInChunk(Stsz stsz, int i, int i2) {
        if (stsz.getSampleSize() != 0) {
            return (i - i2) * stsz.getSampleSize();
        }
        int i3 = 0;
        int min = Math.min(i, stsz.getSampleCount());
        while (i2 < min) {
            i3 += stsz.getEntrySize()[i2];
            i2++;
        }
        return i3;
    }

    private static void parseChunks(Parsable parsable, Map<String, IMpeg4Box> map, Function1<HashSet<String>, Boolean> function1) {
        GhostBox ghostBox = new GhostBox();
        HashSet hashSet = new HashSet(map.keySet());
        while (true) {
            if ((function1 == null || function1.call(hashSet).booleanValue()) && hashSet.size() != 0 && parsable.available() > 0) {
                ghostBox.parse(parsable, (Box) null);
                String type = ghostBox.getType();
                IMpeg4Box iMpeg4Box = map.get(type);
                if (iMpeg4Box == null) {
                    parsable.skip(ghostBox.getSize() - 8);
                } else {
                    iMpeg4Box.parse(parsable, ghostBox);
                    hashSet.remove(type);
                }
            }
        }
        if (function1 != null && function1.call(hashSet).booleanValue()) {
            throw new InvalidBoxException("invalid box: critical box not found!");
        }
    }

    private static int sampleOfTime(Stts stts, int i) {
        int entryCount = stts.getEntryCount();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 >= entryCount) {
                break;
            }
            i4 = stts.getSampleDelta()[i2];
            int i5 = stts.getSampleCount()[i2];
            int i6 = i5 * i4;
            if (i < i6) {
                z = true;
                break;
            }
            i -= i6;
            i3 += i5;
            i2++;
        }
        return z ? i3 + (i / i4) : i3;
    }

    private long seekInternal(int i) {
        long j;
        int[] iArr = new int[2];
        int sampleOfTime = sampleOfTime((Stts) this.essentialStblChunkMap.get("stts"), i);
        chunkOfSample((Stsc) this.essentialStblChunkMap.get("stsc"), sampleOfTime, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        if (this.essentialStblChunkMap.get("stco").getSize() != 0) {
            j = (long) offsetOfChunk((Stco) this.essentialStblChunkMap.get("stco"), i2);
        } else if (this.essentialStblChunkMap.get("co64").getSize() != 0) {
            j = offset64OfChunk((Co64) this.essentialStblChunkMap.get("co64"), i2);
        } else {
            throw new RuntimeException("invalid stbl: both [stco] nor [co64] was found!");
        }
        return j + ((long) offsetOfSampleInChunk((Stsz) this.essentialStblChunkMap.get("stsz"), sampleOfTime, i3));
    }

    private static IMpeg4Box seekTo(Parsable parsable, String str) {
        GhostBox ghostBox = new GhostBox();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        GhostBox ghostBox2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            boolean z = false;
            while (true) {
                if (z || parsable.available() <= 0) {
                    break;
                }
                ghostBox.parse(parsable, (Box) null);
                if (!nextToken.equalsIgnoreCase(ghostBox.getType())) {
                    parsable.skip(ghostBox.getSize() - 8);
                } else {
                    z = true;
                    if (!stringTokenizer.hasMoreTokens()) {
                        ghostBox2 = ghostBox;
                        break;
                    }
                }
            }
        }
        return ghostBox2;
    }

    public void parse(IDataSource iDataSource) {
        ParsableInputStreamWrapper parsableInputStreamWrapper = new ParsableInputStreamWrapper(iDataSource);
        if (seekTo(parsableInputStreamWrapper, "moov.trak.mdia") != null) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("mdhd", this.mdhd);
            hashMap.put("minf", new GhostBox());
            parseChunks(parsableInputStreamWrapper, hashMap, (Function1<HashSet<String>, Boolean>) null);
            if (seekTo(parsableInputStreamWrapper, "stbl") != null) {
                parseChunks(parsableInputStreamWrapper, this.essentialStblChunkMap, new Function1<HashSet<String>, Boolean>() {
                    public Boolean call(HashSet<String> hashSet) {
                        return Boolean.valueOf(Mp4SeekTable.needMoreChunks(hashSet));
                    }
                });
                return;
            }
            throw new InvalidBoxException("invalid mp4: no [stbl] was found!");
        }
        throw new InvalidBoxException("invalid mp4: no [mdia] was found!");
    }

    public long seek(long j) {
        return seekInternal((int) Math.round(((double) (((long) this.mdhd.getTimeScale()) * j)) / 1000.0d));
    }
}
