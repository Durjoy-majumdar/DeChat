package com.tencent.qqmusic.mediaplayer.perf;

import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Xml;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.qqmusic.mediaplayer.AudioInformation;
import com.tencent.qqmusic.mediaplayer.util.Logger;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlSerializer;

public class PrefInfoCollector implements PlayerInfoCollector {
    private static final String ENCODING_UTF_8 = "utf-8";
    private static final String FILE_NAME = "pref_infos.xml";
    private static final String NAMESPACE = null;
    private static final String ROOT = "root";
    /* access modifiers changed from: private */
    public static final String TAG = "PrefInfoCollector";
    private static PrefInfoCollector instance;
    private HandlerThread mHandlerThread;
    private Handler mReportHandler;
    private FileOutputStream outputStream;
    private HashMap<String, Long> prefInfos;
    private String reportFilePath;
    private XmlSerializer xmlSerializer;

    private PrefInfoCollector() {
        this.prefInfos = null;
        this.xmlSerializer = null;
        this.prefInfos = new HashMap<>();
        this.xmlSerializer = Xml.newSerializer();
    }

    /* access modifiers changed from: private */
    public void createOutputs() {
        try {
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), FILE_NAME);
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            String str = TAG;
            Logger.m21786d(str, "setInstrumentation: outputFile: " + file);
            this.reportFilePath = file.getAbsolutePath();
            this.outputStream = new FileOutputStream(file);
            Logger.m21786d(str, "setInstrumentation: outputFilepath: " + this.reportFilePath);
            try {
                this.xmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
                this.xmlSerializer.setOutput(this.outputStream, "utf-8");
                this.xmlSerializer.startDocument("utf-8", Boolean.TRUE);
            } catch (IOException e) {
                Logger.m21788e(TAG, "Unable to open serializer", (Throwable) e);
                throw new RuntimeException("Unable to open serializer: " + e.getMessage(), e);
            }
        } catch (FileNotFoundException e2) {
            Logger.m21788e(TAG, "Unable to open report file: pref_infos.xml", (Throwable) e2);
            throw new RuntimeException("Unable to open report file: " + e2.getMessage(), e2);
        } catch (IOException e3) {
            Logger.m21788e(TAG, "Unable to create report file: pref_infos.xml", (Throwable) e3);
            throw new RuntimeException("Unable to create report file: " + e3.getMessage(), e3);
        }
    }

    public static synchronized PrefInfoCollector getInstance() {
        PrefInfoCollector prefInfoCollector;
        synchronized (PrefInfoCollector.class) {
            if (instance == null) {
                instance = new PrefInfoCollector();
            }
            prefInfoCollector = instance;
        }
        return prefInfoCollector;
    }

    /* access modifiers changed from: private */
    public void printPrefInfos(AudioInformation audioInformation) {
        ArrayList arrayList = new ArrayList(this.prefInfos.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Long>>() {
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                if (entry.getKey().charAt(0) > entry2.getKey().charAt(0)) {
                    return 1;
                }
                if (entry.getKey().charAt(0) == entry2.getKey().charAt(0)) {
                    return 0;
                }
                return -1;
            }
        });
        if (!arrayList.isEmpty()) {
            this.xmlSerializer.startTag(NAMESPACE, ROOT);
            printProperty("device.manufacturer", Build.MANUFACTURER);
            printProperty("device.model", Build.MODEL);
            printProperty("device.apiLevel", String.valueOf(Build.VERSION.SDK_INT));
            printAudioInfomation(audioInformation);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                long longValue = ((Long) entry.getValue()).longValue();
                printProperty((String) entry.getKey(), longValue + "");
            }
            this.xmlSerializer.endTag(NAMESPACE, ROOT);
            this.xmlSerializer.endDocument();
            this.xmlSerializer.flush();
        }
    }

    private void printProperty(String str, String str2) {
        XmlSerializer xmlSerializer2 = this.xmlSerializer;
        String str3 = NAMESPACE;
        xmlSerializer2.startTag(str3, str);
        this.xmlSerializer.text(str2);
        this.xmlSerializer.endTag(str3, str);
    }

    /* access modifiers changed from: private */
    public void upLoadByCommonPost() {
        Logger.m21791i(TAG, "upLoadByCommonPost");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(" http://musict.proxy.music.qq.com/qmtm2/PlayPerformanceReport.fcg").openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
        httpURLConnection.setRequestProperty("Content-Type", "text/xml");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        FileInputStream fileInputStream = new FileInputStream(this.reportFilePath);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                dataOutputStream.write(bArr, 0, read);
            } else {
                fileInputStream.close();
                dataOutputStream.writeBytes(APLogFileUtil.SEPARATOR_LINE);
                dataOutputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                String readLine = new BufferedReader(new InputStreamReader(inputStream, "UTF-8")).readLine();
                String str = TAG;
                Logger.m21791i(str, "upload result:" + readLine);
                dataOutputStream.close();
                inputStream.close();
                return;
            }
        }
    }

    public void printAudioInfomation(AudioInformation audioInformation) {
        printProperty("audio.format", audioInformation.getAudioType() + "");
        printProperty("audio.sampleRate", audioInformation.getSampleRate() + "");
        printProperty("audio.PlaySample", audioInformation.getPlaySample() + "");
        printProperty("audio.bitDepth", audioInformation.getBitDepth() + "");
        printProperty("audio.channels", audioInformation.getChannels() + "");
        printProperty("audio.duration", audioInformation.getDuration() + "");
        printProperty("audio.bitRate", audioInformation.getBitrate() + "");
    }

    public void putBoolean(String str, boolean z) {
    }

    public void putInt(String str, int i) {
    }

    public void putLong(String str, long j) {
        this.prefInfos.put(str, Long.valueOf(j));
    }

    public void putString(String str, String str2) {
    }

    public void putUri(String str, Uri uri) {
    }

    public void upLoadPrefInfos(final AudioInformation audioInformation) {
        HashMap<String, Long> hashMap = this.prefInfos;
        if (hashMap != null && !hashMap.isEmpty()) {
            if (this.mHandlerThread == null || this.mReportHandler == null) {
                HandlerThread handlerThread = new HandlerThread(TAG);
                this.mHandlerThread = handlerThread;
                handlerThread.start();
                this.mReportHandler = new Handler(this.mHandlerThread.getLooper());
            }
            this.mReportHandler.post(new Runnable() {
                public void run() {
                    try {
                        PrefInfoCollector.this.createOutputs();
                        PrefInfoCollector.this.printPrefInfos(audioInformation);
                        PrefInfoCollector.this.upLoadByCommonPost();
                    } catch (Exception e) {
                        Logger.m21790e(PrefInfoCollector.TAG, (Throwable) e);
                    }
                }
            });
        }
    }
}
