package com.tencent.qqmusic.mediaplayer.audioplaylist.itemparser;

import android.text.TextUtils;
import com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo;
import com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo;
import com.tencent.qqmusic.mediaplayer.codec.NativeDecoder;
import com.tencent.qqmusic.mediaplayer.upstream.FileDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CueItemParser extends AudioPlayListItemParser {
    public static final String TAG = "CueItemParser";
    private LineNumberReader mReader;
    public List<TrackInfo> mTrackInfoList = new LinkedList();

    public CueItemParser(String str) {
        this.mUri = str;
    }

    private long convertTimeStrToMs(String str) {
        String[] split = str.split(XVFSFile.PATH_SEPARATOR);
        long parseLong = Long.parseLong(split[0]);
        return (((parseLong * 60) + Long.parseLong(split[1])) * 1000) + (Long.parseLong(split[2]) * 10);
    }

    private String guessCharsetEncoding(String str) {
        Logger.m21791i(TAG, "CueItemParser.guessCharsetEncoding, filePath: " + str);
        return guessCharsetEncoding(new FileInputStream(str));
    }

    public boolean isParseSuccess() {
        return !this.mTrackInfoList.isEmpty();
    }

    public Iterator<TrackInfo> iterator() {
        return this.mTrackInfoList.iterator();
    }

    public void parse() {
        int i;
        String str;
        File file;
        String str2;
        int i2;
        long j;
        boolean z;
        int i3;
        String str3 = "/";
        Logger.m21791i(TAG, "CueItemParser.parse, uri: " + this.mUri);
        File file2 = new File(this.mUri);
        this.mTrackInfoList.clear();
        try {
            this.mReader = new LineNumberReader(new InputStreamReader(new FileInputStream(file2), guessCharsetEncoding(this.mUri)));
            TrackInfo trackInfo = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            boolean z2 = false;
            long j2 = 0;
            int i4 = 0;
            boolean z3 = false;
            int i5 = 0;
            while (true) {
                try {
                    String readLine = this.mReader.readLine();
                    i5 = this.mReader.getLineNumber();
                    if (!TextUtils.isEmpty(readLine)) {
                        if (!z2) {
                            if (readLine.trim().toUpperCase().startsWith("PERFORMER")) {
                                str5 = AudioPlayListItemParser.delSeprator(readLine);
                            }
                        }
                        if (!z2) {
                            str = str5;
                            if (readLine.trim().toUpperCase().startsWith("TITLE")) {
                                str4 = AudioPlayListItemParser.delSeprator(readLine);
                            }
                        } else {
                            str = str5;
                        }
                        String str7 = str4;
                        if (readLine.trim().toUpperCase().startsWith("FILE")) {
                            if (z2) {
                                z2 = false;
                            }
                            if (!(j2 == 0 || trackInfo == null)) {
                                trackInfo.setEndPostion(j2);
                            }
                            String delSeprator = AudioPlayListItemParser.delSeprator(readLine);
                            String parent = file2.getParent();
                            if (!parent.endsWith(str3)) {
                                parent = parent + str3;
                            }
                            if (delSeprator.startsWith(str3)) {
                                delSeprator = delSeprator.substring(1);
                            }
                            String str8 = parent + delSeprator;
                            if (new File(str8).exists()) {
                                NativeDecoder nativeDecoder = new NativeDecoder();
                                int init = nativeDecoder.init((IDataSource) new FileDataSource(str8));
                                if (init == 0) {
                                    j2 = nativeDecoder.getAudioInformation().getDuration();
                                    str2 = str3;
                                    file = file2;
                                } else {
                                    str2 = str3;
                                    StringBuilder sb = new StringBuilder();
                                    file = file2;
                                    sb.append("media item in cue init fail! ret = ");
                                    sb.append(init);
                                    sb.append(" ,path: ");
                                    sb.append(str8);
                                    Logger.m21787e(TAG, sb.toString());
                                }
                                nativeDecoder.release();
                                str6 = str8;
                            } else {
                                throw new IOException("media file in cue not exist! cue Path: " + this.mUri);
                            }
                        } else {
                            str2 = str3;
                            file = file2;
                        }
                        if (readLine.trim().toUpperCase().startsWith("TRACK")) {
                            trackInfo = new TrackInfo(AudioPlayListItemInfo.TYPE_CUE);
                            trackInfo.setFilePath(str6);
                            i2 = i4 + 1;
                            z2 = true;
                        } else {
                            i2 = i4;
                        }
                        if (z2 && readLine.trim().toUpperCase().startsWith("TITLE")) {
                            trackInfo.setTitle(AudioPlayListItemParser.delSeprator(readLine));
                        }
                        if (z2 && readLine.trim().toUpperCase().startsWith("PERFORMER")) {
                            trackInfo.setPerformer(AudioPlayListItemParser.delSeprator(readLine));
                        }
                        if (i2 == 1) {
                            if (readLine.trim().toUpperCase().startsWith("INDEX")) {
                                if (readLine.trim().contains(" 01 ")) {
                                    trackInfo.setStartPosition(convertTimeStrToMs(readLine.trim().split(" 01 ")[1].trim()));
                                } else {
                                    throw new IOException("first item in CUE must only have feature \"INDEX 01\"!");
                                }
                            }
                        }
                        if (i2 < 2 || !readLine.trim().toUpperCase().startsWith("INDEX")) {
                            z = z2;
                            j = j2;
                        } else if (readLine.trim().contains(" 00 ")) {
                            z = z2;
                            j = j2;
                            this.mTrackInfoList.get(i2 - 2).setEndPostion(convertTimeStrToMs(readLine.trim().split(" 00 ")[1].trim()));
                            i3 = 1;
                            z3 = true;
                            if (i2 >= i3 && readLine.trim().toUpperCase().startsWith("INDEX") && readLine.trim().contains(" 01 ")) {
                                this.mTrackInfoList.add(trackInfo);
                                TrackInfo trackInfo2 = new TrackInfo(AudioPlayListItemInfo.TYPE_CUE);
                                trackInfo2.setFilePath(str6);
                                trackInfo = trackInfo2;
                                z3 = false;
                            }
                            i4 = i2;
                            z2 = z;
                            str4 = str7;
                            str5 = str;
                            str3 = str2;
                            file2 = file;
                            j2 = j;
                        } else {
                            z = z2;
                            j = j2;
                            if (readLine.trim().contains(" 01 ")) {
                                String trim = readLine.trim().split(" 01 ")[1].trim();
                                trackInfo.setStartPosition(convertTimeStrToMs(trim));
                                if (!z3) {
                                    this.mTrackInfoList.get(i2 - 2).setEndPostion(convertTimeStrToMs(trim));
                                }
                            } else {
                                throw new IOException("item " + i2 + " in CUE have illegel feature \"INDEX\"!");
                            }
                        }
                        i3 = 1;
                        this.mTrackInfoList.add(trackInfo);
                        TrackInfo trackInfo22 = new TrackInfo(AudioPlayListItemInfo.TYPE_CUE);
                        trackInfo22.setFilePath(str6);
                        trackInfo = trackInfo22;
                        z3 = false;
                        i4 = i2;
                        z2 = z;
                        str4 = str7;
                        str5 = str;
                        str3 = str2;
                        file2 = file;
                        j2 = j;
                    } else {
                        if (!this.mTrackInfoList.isEmpty()) {
                            List<TrackInfo> list = this.mTrackInfoList;
                            TrackInfo trackInfo3 = list.get(list.size() - 1);
                            if (!(j2 == 0 || trackInfo3.getRange() == null || ((Long) trackInfo3.getRange().second).longValue() != 0)) {
                                trackInfo3.setEndPostion(j2);
                            }
                            for (int i6 = 0; i6 < this.mTrackInfoList.size(); i6++) {
                                TrackInfo trackInfo4 = this.mTrackInfoList.get(i6);
                                if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(trackInfo4.getAlbum())) {
                                    trackInfo4.setAlbum(str4);
                                }
                                if (!TextUtils.isEmpty(str5) && TextUtils.isEmpty(trackInfo4.getPerformer())) {
                                    trackInfo4.setPerformer(str5);
                                }
                            }
                        }
                        try {
                            this.mReader.close();
                            return;
                        } catch (Exception e) {
                            Logger.m21788e(TAG, "LineNumberReader close ex", (Throwable) e);
                            return;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    i = i5;
                    try {
                        throw new ParseException("Parse Exception occured", e, i);
                    } catch (Throwable th) {
                        Throwable th4 = th;
                        try {
                            this.mReader.close();
                        } catch (Exception e3) {
                            Logger.m21788e(TAG, "LineNumberReader close ex", (Throwable) e3);
                        }
                        throw th4;
                    }
                }
            }
        } catch (IOException e4) {
            e = e4;
            i = 0;
            throw new ParseException("Parse Exception occured", e, i);
        }
    }
}
