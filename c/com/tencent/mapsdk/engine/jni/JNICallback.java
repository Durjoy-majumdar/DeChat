package com.tencent.mapsdk.engine.jni;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.os.AsyncTask;
import com.tencent.map.lib.JNIInterfaceCallback;
import com.tencent.map.lib.models.MapTileID;
import com.tencent.mapsdk.engine.jni.models.IconImageInfo;
import com.tencent.mapsdk.engine.jni.models.TextBitmapInfo;
import com.tencent.mapsdk.internal.C0949kl;
import com.tencent.mapsdk.internal.C104558mm;
import com.tencent.mapsdk.internal.C113569br;
import com.tencent.mapsdk.internal.C113889km;
import com.tencent.mapsdk.internal.C113896kq;
import com.tencent.mapsdk.internal.C113931lg;
import com.tencent.mapsdk.internal.C114007oa;
import com.tencent.mapsdk.internal.C114010od;
import com.tencent.mapsdk.internal.C114012of;
import com.tencent.mapsdk.internal.C114013og;
import com.tencent.mapsdk.internal.C114014ok;
import com.tencent.mapsdk.internal.C114015ol;
import com.tencent.mapsdk.internal.C114016om;
import com.tencent.mapsdk.internal.C114017on;
import com.tencent.mapsdk.internal.C114018oo;
import com.tencent.mapsdk.internal.C114019op;
import com.tencent.mapsdk.internal.C114371w;
import com.tencent.mapsdk.internal.C40002he;
import com.tencent.xweb.file.XVFSFile;
import java.util.Hashtable;

public class JNICallback implements JNIInterfaceCallback {
    private static final int CB_TYPE_CAL_TEXT_SIZE = 2;
    private static final int CB_TYPE_CANCEL_DOWNLOAD = 10;
    private static final int CB_TYPE_DOWNLOAD = 3;
    private static final int CB_TYPE_DRAW_TEXT = 1;
    private static final int CB_TYPE_INDOOR_BUILDING_CHANGED = 8;
    private static final int CB_TYPE_LOAD_RES = 4;
    private static final int CB_TYPE_NOTIFY_SET_CENTER_AND_SCALE_ANIM_FINISHED = 9;
    private static final int CB_TYPE_REPORT_ENGINE_CRASH_INFO = 7;
    private static final int CB_TYPE_UPDATE_MAP_PARAM = 6;
    private static final int CB_TYPE_WRITE_FILE = 5;
    private static final int IMG_TYPE_SAT = 1;
    private C114012of mCancelDownloadCallback;
    private C114015ol mCbkGetGLContext;
    private C114013og mDownloadCallback;
    private C113569br mEngineCrashInfoRecorder;
    private C114014ok mIndoorBuildingChangeCallback;
    private C114017on mMapAnimCallback;
    private C114016om mMapCameraChangeCallback;
    private C114010od mMapLayerClickResultCallback;
    private C114018oo mMapLoadFinishedCallback;
    private C114019op mMapParamChangeCallback;
    private C114007oa mRender;
    private C114371w mResources;
    private Hashtable<Long, Paint> mTextPaints = new Hashtable<>();
    private Hashtable<Long, PointF> mTextSizeBuffers = new Hashtable<>();
    private Bitmap textCanvas;

    /* renamed from: com.tencent.mapsdk.engine.jni.JNICallback$a */
    public static final class C113494a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private String f339612a;

        /* renamed from: b */
        private byte[] f339613b;

        public C113494a(String str, byte[] bArr) {
            this.f339612a = str;
            this.f339613b = bArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
            if (r2 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
            if (r2 != null) goto L_0x0040;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[SYNTHETIC, Splitter:B:16:0x0039] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x004b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Void m155433a() {
            /*
                r4 = this;
                java.io.File r0 = new java.io.File
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = r4.f339612a
                r1.append(r2)
                java.lang.String r2 = ".tmp"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r1 = 0
                boolean r2 = r0.exists()     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003d, all -> 0x0036 }
                if (r2 != 0) goto L_0x0022
                com.tencent.mapsdk.internal.C113884kf.m157489a((java.io.File) r0)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003d, all -> 0x0036 }
            L_0x0022:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003d, all -> 0x0036 }
                r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0044, IOException -> 0x003d, all -> 0x0036 }
                byte[] r3 = r4.f339613b     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003e, all -> 0x0033 }
                r2.write(r3)     // Catch:{ FileNotFoundException -> 0x0045, IOException -> 0x003e, all -> 0x0033 }
                r3 = 1
                r2.close()     // Catch:{ IOException -> 0x0031 }
                goto L_0x0049
            L_0x0031:
                goto L_0x0049
            L_0x0033:
                r0 = move-exception
                r1 = r2
                goto L_0x0037
            L_0x0036:
                r0 = move-exception
            L_0x0037:
                if (r1 == 0) goto L_0x003c
                r1.close()     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                throw r0
            L_0x003d:
                r2 = r1
            L_0x003e:
                if (r2 == 0) goto L_0x0048
            L_0x0040:
                r2.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x0048
            L_0x0044:
                r2 = r1
            L_0x0045:
                if (r2 == 0) goto L_0x0048
                goto L_0x0040
            L_0x0048:
                r3 = 0
            L_0x0049:
                if (r3 == 0) goto L_0x0055
                java.io.File r2 = new java.io.File
                java.lang.String r3 = r4.f339612a
                r2.<init>(r3)
                r0.renameTo(r2)
            L_0x0055:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.engine.jni.JNICallback.C113494a.m155433a():java.lang.Void");
        }

        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m155433a();
        }
    }

    public JNICallback(C114007oa oaVar, C114371w wVar, C114013og ogVar, C114012of ofVar, C114018oo ooVar, C114014ok okVar, C114017on onVar, C113569br brVar, C114019op opVar, C114016om omVar, C114010od odVar) {
        this.mRender = oaVar;
        this.mResources = wVar;
        this.mDownloadCallback = ogVar;
        this.mCancelDownloadCallback = ofVar;
        this.mMapLoadFinishedCallback = ooVar;
        this.mMapParamChangeCallback = opVar;
        this.mIndoorBuildingChangeCallback = okVar;
        this.mMapCameraChangeCallback = omVar;
        this.mMapAnimCallback = onVar;
        this.mEngineCrashInfoRecorder = brVar;
        this.mMapLayerClickResultCallback = odVar;
    }

    private void cacheTextPaint(Paint paint) {
        Hashtable<Long, Paint> hashtable = this.mTextPaints;
        if (hashtable != null) {
            hashtable.put(Long.valueOf(Thread.currentThread().getId()), paint);
        }
    }

    private void cacheTextSize(PointF pointF) {
        Hashtable<Long, PointF> hashtable = this.mTextSizeBuffers;
        if (hashtable != null) {
            hashtable.put(Long.valueOf(Thread.currentThread().getId()), pointF);
        }
    }

    private PointF calTextSize(String str, int i) {
        float measureText = initTextPaint(i).measureText(str) + 1.0f;
        int i2 = i + 2;
        PointF textSize = getTextSize();
        if (textSize == null) {
            textSize = new PointF();
            cacheTextSize(textSize);
        }
        textSize.x = measureText;
        textSize.y = (float) i2;
        return textSize;
    }

    private void cancelDownload(String str, C113931lg lgVar) {
        if (this.mCancelDownloadCallback != null) {
            C113889km.m157537a("Engine callback cancel download:".concat(String.valueOf(str)));
            this.mCancelDownloadCallback.mo172576a(str, lgVar);
        }
    }

    private void download(String str, C113931lg lgVar) {
        if (this.mDownloadCallback != null) {
            C113889km.m157537a("Engine callback download:" + str + XVFSFile.PATH_SEPARATOR + lgVar);
            this.mDownloadCallback.mo172577b(str, lgVar);
        }
    }

    private Bitmap drawText(int i, String str, byte[] bArr) {
        TextBitmapInfo textBitmapInfo = new TextBitmapInfo();
        textBitmapInfo.fill(bArr);
        if (textBitmapInfo.width == 0 || textBitmapInfo.height == 0) {
            return null;
        }
        if (this.textCanvas == null) {
            this.textCanvas = Bitmap.createBitmap(400, 400, Bitmap.Config.ALPHA_8);
        }
        if (this.textCanvas == null) {
            return null;
        }
        Paint initTextPaint = initTextPaint(i);
        this.textCanvas.eraseColor(0);
        initTextPaint.setFakeBoldText(textBitmapInfo.bold);
        new Canvas(this.textCanvas).drawText(str, 200.0f, 200.0f - ((initTextPaint.descent() + initTextPaint.ascent()) / 2.0f), initTextPaint);
        return this.textCanvas;
    }

    private Paint getTextPaint() {
        Hashtable<Long, Paint> hashtable = this.mTextPaints;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(Long.valueOf(Thread.currentThread().getId()));
    }

    private PointF getTextSize() {
        Hashtable<Long, PointF> hashtable = this.mTextSizeBuffers;
        if (hashtable == null) {
            return null;
        }
        return hashtable.get(Long.valueOf(Thread.currentThread().getId()));
    }

    private Paint initTextPaint(int i) {
        Paint textPaint = getTextPaint();
        C104558mm mmVar = textPaint;
        if (textPaint == null) {
            C104558mm mmVar2 = new C104558mm(this.mResources.f342828a);
            mmVar2.setTypeface(Typeface.DEFAULT);
            mmVar2.setAntiAlias(true);
            mmVar2.setStyle(Paint.Style.FILL);
            mmVar2.setTextAlign(Paint.Align.CENTER);
            mmVar2.setLinearText(true);
            cacheTextPaint(mmVar2);
            mmVar = mmVar2;
        }
        mmVar.setTextAlign(Paint.Align.CENTER);
        mmVar.setTextSize((float) i);
        return mmVar;
    }

    private IconImageInfo loadImage(int i, byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            try {
                String str = new String(bArr);
                if (i != 1) {
                    return this.mResources.mo173079a(str);
                }
                C114371w wVar = this.mResources;
                IconImageInfo iconImageInfo = new IconImageInfo();
                iconImageInfo.scale = wVar.f342830c;
                iconImageInfo.anchorPointX1 = 0.5f;
                iconImageInfo.anchorPointY1 = 0.5f;
                iconImageInfo.bitmap = wVar.mo173078a(str, Bitmap.Config.RGB_565);
                return iconImageInfo;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private void writeFile(String str, byte[] bArr) {
        if (bArr != null) {
            new C113494a(str, bArr).execute(new Void[0]);
        }
    }

    public Object callback(int i, int i2, String str, byte[] bArr, Object obj) {
        JNIEvent jNIEvent = new JNIEvent();
        jNIEvent.f339614id = i2;
        jNIEvent.name = str;
        jNIEvent.data = bArr;
        jNIEvent.extra = obj;
        return callback(i, jNIEvent);
    }

    public int callbackGetGLContext() {
        C114015ol olVar = this.mCbkGetGLContext;
        if (olVar != null) {
            return olVar.getEGLContextHash();
        }
        return 0;
    }

    public void destory() {
        Hashtable<Long, Paint> hashtable = this.mTextPaints;
        if (hashtable != null) {
            hashtable.clear();
            this.mTextPaints = null;
        }
        Hashtable<Long, PointF> hashtable2 = this.mTextSizeBuffers;
        if (hashtable2 != null) {
            hashtable2.clear();
            this.mTextSizeBuffers = null;
        }
        this.mResources = null;
        this.mDownloadCallback = null;
        this.mCancelDownloadCallback = null;
        this.mMapParamChangeCallback = null;
        this.mIndoorBuildingChangeCallback = null;
        this.mMapCameraChangeCallback = null;
        this.mRender = null;
    }

    public boolean onJniCallbackRenderMapFrame(int i) {
        C114007oa oaVar = this.mRender;
        if (oaVar != null) {
            return oaVar.mo172563b(i);
        }
        return false;
    }

    public void onMapCameraChangeStopped() {
        C114016om omVar = this.mMapCameraChangeCallback;
        if (omVar != null) {
            omVar.mo172579i();
        }
    }

    public void onMapCameraChanged() {
        C114016om omVar = this.mMapCameraChangeCallback;
        if (omVar != null) {
            omVar.mo172578h();
        }
    }

    public void onMapLoaded() {
        C114018oo ooVar = this.mMapLoadFinishedCallback;
        if (ooVar != null) {
            ooVar.mo172580m_();
        }
    }

    public void onVisualLayerClickResult(float f, float f2, long j, String str, String str2) {
        C114010od odVar = this.mMapLayerClickResultCallback;
        if (odVar != null) {
            odVar.mo172574a(f, f2, j, str, str2);
        }
    }

    public void setMapCallbackGetGLContext(C114015ol olVar) {
        this.mCbkGetGLContext = olVar;
    }

    public Object callback(int i, JNIEvent jNIEvent) {
        boolean z = true;
        switch (i) {
            case 1:
                return drawText(jNIEvent.f339614id, jNIEvent.name, jNIEvent.data);
            case 2:
                return calTextSize(jNIEvent.name, jNIEvent.f339614id);
            case 3:
                if (!C40002he.m42805a(jNIEvent.name)) {
                    C113931lg lgVar = new C113931lg();
                    lgVar.f340788a = jNIEvent.f339614id;
                    Object obj = jNIEvent.extra;
                    if (obj instanceof MapTileID) {
                        MapTileID mapTileID = (MapTileID) obj;
                        lgVar.f340789b = mapTileID.getDataSource().getValue();
                        lgVar.f340790c = mapTileID.getPriority().getValue();
                    }
                    lgVar.f340791d = jNIEvent.extra;
                    download(jNIEvent.name, lgVar);
                    break;
                }
                break;
            case 4:
                IconImageInfo loadImage = loadImage(jNIEvent.f339614id, jNIEvent.data);
                byte[] bArr = jNIEvent.data;
                if (bArr == null) {
                    return loadImage;
                }
                new String(bArr);
                return loadImage;
            case 5:
                C113889km.m157545b(C0949kl.f2236f, "CB_TYPE_WRITE_FILE:" + jNIEvent.name);
                writeFile(jNIEvent.name, jNIEvent.data);
                break;
            case 6:
                C114019op opVar = this.mMapParamChangeCallback;
                if (opVar != null) {
                    opVar.mo172581g();
                    break;
                }
                break;
            case 7:
                C113569br brVar = this.mEngineCrashInfoRecorder;
                if (brVar != null) {
                    brVar.mo171845a(jNIEvent.name);
                    break;
                }
                break;
            case 8:
                C114014ok okVar = this.mIndoorBuildingChangeCallback;
                if (okVar != null) {
                    okVar.mo171193c();
                    break;
                }
                break;
            case 9:
                C114017on onVar = this.mMapAnimCallback;
                if (onVar != null) {
                    if (jNIEvent.f339614id <= 0) {
                        z = false;
                    }
                    onVar.mo171220a(z);
                    break;
                }
                break;
            case 10:
                C113896kq.m157658a("CB_TYPE_CANCEL_DOWNLOAD", jNIEvent);
                if (!C40002he.m42805a(jNIEvent.name)) {
                    C113931lg lgVar2 = new C113931lg();
                    lgVar2.f340788a = jNIEvent.f339614id;
                    Object obj2 = jNIEvent.extra;
                    if (obj2 instanceof MapTileID) {
                        MapTileID mapTileID2 = (MapTileID) obj2;
                        lgVar2.f340789b = mapTileID2.getDataSource().getValue();
                        lgVar2.f340790c = mapTileID2.getPriority().getValue();
                    }
                    lgVar2.f340791d = jNIEvent.extra;
                    cancelDownload(jNIEvent.name, lgVar2);
                    break;
                }
                break;
        }
        return null;
    }
}
