package nj3;

import a70.C112760b;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.StringBuilderPrinter;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: nj3.t0 */
public class C88998t0 extends SurfaceTexture {

    /* renamed from: a */
    public SurfaceTexture f256586a = null;

    public C88998t0(int i) {
        super(i);
    }

    /* renamed from: a */
    public static String m111206a() {
        String str;
        StringBuilder sb = new StringBuilder(256);
        StringBuilderPrinter stringBuilderPrinter = new StringBuilderPrinter(sb);
        Context context = MMApplicationContext.getContext();
        stringBuilderPrinter.println("#accinfo.revision=" + BuildInfo.REV);
        stringBuilderPrinter.println("#accinfo.build=" + BuildInfo.TIME + XVFSFile.PATH_SEPARATOR + BuildInfo.HOSTNAME + XVFSFile.PATH_SEPARATOR + ChannelUtil.channelId);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("#accinfo.env=");
        sb4.append(CrashReportFactory.foreground ? "f" : "b");
        sb4.append(XVFSFile.PATH_SEPARATOR);
        sb4.append(Thread.currentThread().getName());
        sb4.append(XVFSFile.PATH_SEPARATOR);
        sb4.append(CrashReportFactory.currentActivity);
        stringBuilderPrinter.println(sb4.toString());
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            StatFs statFs2 = new StatFs(C112760b.m154230f0());
            str = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[]{Integer.valueOf(((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryClass()), Environment.getDataDirectory().getAbsolutePath(), Integer.valueOf(statFs.getBlockSize()), Integer.valueOf(statFs.getBlockCount()), Integer.valueOf(statFs.getAvailableBlocks()), C112760b.m154230f0(), Integer.valueOf(statFs2.getBlockSize()), Integer.valueOf(statFs2.getBlockCount()), Integer.valueOf(statFs2.getAvailableBlocks())});
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MMSurfaceTextureWrap", "check data size failed :%s", e.getMessage());
            str = "";
        }
        stringBuilderPrinter.println("#accinfo.data=" + str);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        stringBuilderPrinter.println("#accinfo.crashTime=" + simpleDateFormat.format(date));
        stringBuilderPrinter.println("#crashContent=");
        return sb.toString();
    }

    public void attachToGLContext(int i) {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, attachToGLContext");
        this.f256586a.attachToGLContext(i);
    }

    public void detachFromGLContext() {
        boolean z;
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, detachFromGLContext");
        try {
            this.f256586a.detachFromGLContext();
            z = false;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", e, "%s", "detect texture problem, RuntimeException detachFromGLContext");
            z = true;
        }
        if (z) {
            try {
                Method declaredMethod = SurfaceTexture.class.getDeclaredMethod("nativeDetachFromGLContext", new Class[0]);
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke(this.f256586a, new Object[0])).intValue();
                String str = m111206a() + " detect texture problem error code = " + intValue + ", detach = " + true + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", Integer.valueOf(intValue), Boolean.TRUE, Boolean.valueOf(z));
            } catch (IllegalArgumentException e2) {
                Log.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", e2, "%s", "detect texture problem, IllegalArgumentException");
                String str2 = m111206a() + " detect texture problem error code = " + 0 + ", detach = " + false + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str2.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str2);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, Boolean.FALSE, Boolean.valueOf(z));
            } catch (IllegalAccessException e3) {
                Log.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", e3, "%s", "detect texture problem, IllegalAccessException");
                String str3 = m111206a() + " detect texture problem error code = " + 0 + ", detach = " + false + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str3.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str3);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, Boolean.FALSE, Boolean.valueOf(z));
            } catch (InvocationTargetException e4) {
                Log.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", e4, "%s", "detect texture problem, InvocationTargetException");
                String str4 = m111206a() + " detect texture problem error code = " + 0 + ", detach = " + false + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str4.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str4);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, Boolean.FALSE, Boolean.valueOf(z));
            } catch (NoSuchMethodException e5) {
                Log.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", e5, "%s", "detect texture problem, NoSuchMethodException");
                String str5 = m111206a() + " detect texture problem error code = " + 0 + ", detach = " + false + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str5.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str5);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, Boolean.FALSE, Boolean.valueOf(z));
            } catch (Exception e6) {
                Log.printErrStackTrace("MicroMsg.MMSurfaceTextureWrap", e6, "%s", "detect texture problem, Exception");
                String str6 = m111206a() + " detect texture problem error code = " + 0 + ", detach = " + false + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str6.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str6);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, Boolean.FALSE, Boolean.valueOf(z));
            } catch (Throwable th) {
                String str7 = m111206a() + " detect texture problem error code = " + 0 + ", detach = " + false + ", and error = " + z;
                CrashReportFactory.reportRawMessage(Base64.encodeToString(str7.getBytes(), 2), "DetachFromGLContext");
                Log.m105928w("MicroMsg.MMSurfaceTextureWrap", str7);
                Log.m105925i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, err %s hasDetach %s hasError %s", 0, Boolean.FALSE, Boolean.valueOf(z));
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        return this.f256586a.equals(obj);
    }

    public long getTimestamp() {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTimestamp");
        return this.f256586a.getTimestamp();
    }

    public void getTransformMatrix(float[] fArr) {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, getTransformMatrix");
        this.f256586a.getTransformMatrix(fArr);
    }

    public int hashCode() {
        return this.f256586a.hashCode();
    }

    public void release() {
        super.release();
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, release");
        this.f256586a.release();
    }

    public void releaseTexImage() {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, releaseTexImage");
        this.f256586a.releaseTexImage();
    }

    public void setDefaultBufferSize(int i, int i2) {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setDefaultBufferSize");
        this.f256586a.setDefaultBufferSize(i, i2);
    }

    public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener) {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, setOnFrameAvailableListener");
        this.f256586a.setOnFrameAvailableListener(onFrameAvailableListener);
    }

    public String toString() {
        return this.f256586a.toString();
    }

    public void updateTexImage() {
        Log.m105924i("MicroMsg.MMSurfaceTextureWrap", "detect texture problem, updateTexImage");
        this.f256586a.updateTexImage();
    }
}
