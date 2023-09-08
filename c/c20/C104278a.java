package c20;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.lang.reflect.Field;

/* renamed from: c20.a */
public class C104278a {

    /* renamed from: a */
    public int[] f308621a = null;

    public C104278a() {
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo;
        int[] iArr = null;
        ActivityManager activityManager = (ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length != 0 && (memoryInfo = processMemoryInfo[0]) != null) {
            try {
                Field declaredField = Class.forName("android.os.Debug$MemoryInfo").getDeclaredField("otherStats");
                declaredField.setAccessible(true);
                iArr = (int[]) declaredField.get(memoryInfo);
            } catch (Exception unused) {
                Log.m105920e("Gpu.GpuMemoryGetter", "getOtherStatsByReflect fail");
            }
            this.f308621a = iArr;
        }
    }

    /* renamed from: a */
    public int mo145939a() {
        int[] iArr = this.f308621a;
        if (iArr == null) {
            Log.m105920e("Gpu.GpuMemoryGetter", "getEGL fail, because otherStats == null");
            return 0;
        }
        try {
            return iArr[131] + iArr[129];
        } catch (Exception unused) {
            Log.m105920e("Gpu.GpuMemoryGetter", "getEGL fail, because getOtherPrivate fail");
            return 0;
        }
    }

    /* renamed from: b */
    public int mo145940b() {
        int[] iArr = this.f308621a;
        if (iArr == null) {
            Log.m105920e("Gpu.GpuMemoryGetter", "getGL fail, because getOtherStats == null");
            return 0;
        }
        try {
            return iArr[140] + iArr[138];
        } catch (Exception unused) {
            Log.m105920e("Gpu.GpuMemoryGetter", "getGL fail, because getOtherStats == null");
            return 0;
        }
    }

    /* renamed from: c */
    public int mo145941c() {
        int[] iArr = this.f308621a;
        if (iArr == null) {
            Log.m105920e("Gpu.GpuMemoryGetter", "getGfx fail, because otherStats == null");
            return 0;
        }
        try {
            return iArr[41] + iArr[39];
        } catch (Exception unused) {
            Log.m105920e("Gpu.GpuMemoryGetter", "getGfx fail, because getOtherPrivate fail");
            return 0;
        }
    }
}
