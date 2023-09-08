package org.webrtc;

import android.hardware.Camera;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] next : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(next[0], next[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size next : list) {
            arrayList.add(new Size(next.width, next.height));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int r15) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Get supported formats for camera index "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r2 = "."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Camera1Enumerator"
            org.webrtc.Logging.m25022d(r2, r0)
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r6 = "Opening camera with index "
            r5.append(r6)     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            r5.append(r15)     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            org.webrtc.Logging.m25022d(r2, r5)     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            k20.a r5 = new k20.a     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            r5.mo10233c(r6)     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.Object r7 = new java.lang.Object     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.Object[] r8 = r5.mo10232b()     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            java.lang.String r9 = "org/webrtc/Camera1Enumerator"
            java.lang.String r10 = "enumerateFormats"
            java.lang.String r11 = "(I)Ljava/util/List;"
            java.lang.String r12 = "android/hardware/Camera"
            java.lang.String r13 = "open"
            java.lang.String r14 = "(I)Landroid/hardware/Camera;"
            java.lang.Object r5 = j20.C117292a.m165364j(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            r6 = r5
            android.hardware.Camera r6 = (android.hardware.Camera) r6     // Catch:{ RuntimeException -> 0x00f6, all -> 0x00f4 }
            android.hardware.Camera$Parameters r0 = r6.getParameters()     // Catch:{ RuntimeException -> 0x00f1, all -> 0x00ee }
            java.lang.String r7 = "org/webrtc/Camera1Enumerator"
            java.lang.String r8 = "enumerateFormats"
            java.lang.String r9 = "(I)Ljava/util/List;"
            java.lang.String r10 = "android/hardware/Camera"
            java.lang.String r11 = "release"
            java.lang.String r12 = "()V"
            j20.C117292a.m165363i(r6, r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r6 = r0.getSupportedPreviewFpsRange()     // Catch:{ Exception -> 0x00b4 }
            r7 = 0
            if (r6 == 0) goto L_0x0092
            int r8 = r6.size()     // Catch:{ Exception -> 0x00b4 }
            r9 = 1
            int r8 = r8 - r9
            java.lang.Object r6 = r6.get(r8)     // Catch:{ Exception -> 0x00b4 }
            int[] r6 = (int[]) r6     // Catch:{ Exception -> 0x00b4 }
            r7 = r6[r7]     // Catch:{ Exception -> 0x00b4 }
            r6 = r6[r9]     // Catch:{ Exception -> 0x00b4 }
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            java.util.List r0 = r0.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x00b4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b4 }
        L_0x009b:
            boolean r8 = r0.hasNext()     // Catch:{ Exception -> 0x00b4 }
            if (r8 == 0) goto L_0x00c9
            java.lang.Object r8 = r0.next()     // Catch:{ Exception -> 0x00b4 }
            android.hardware.Camera$Size r8 = (android.hardware.Camera.Size) r8     // Catch:{ Exception -> 0x00b4 }
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r9 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat     // Catch:{ Exception -> 0x00b4 }
            int r10 = r8.width     // Catch:{ Exception -> 0x00b4 }
            int r8 = r8.height     // Catch:{ Exception -> 0x00b4 }
            r9.<init>(r10, r8, r7, r6)     // Catch:{ Exception -> 0x00b4 }
            r5.add(r9)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x009b
        L_0x00b4:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "getSupportedFormats() failed on camera index "
            r6.append(r7)
            r6.append(r15)
            java.lang.String r6 = r6.toString()
            org.webrtc.Logging.m25024e(r2, r6, r0)
        L_0x00c9:
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = " done. Time spent: "
            r0.append(r15)
            long r6 = r6 - r3
            r0.append(r6)
            java.lang.String r15 = " ms."
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            org.webrtc.Logging.m25022d(r2, r15)
            return r5
        L_0x00ee:
            r15 = move-exception
            r0 = r6
            goto L_0x0128
        L_0x00f1:
            r0 = move-exception
            r3 = r6
            goto L_0x00f9
        L_0x00f4:
            r15 = move-exception
            goto L_0x0128
        L_0x00f6:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L_0x00f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r1.<init>()     // Catch:{ all -> 0x0126 }
            java.lang.String r4 = "Open camera failed on camera index "
            r1.append(r4)     // Catch:{ all -> 0x0126 }
            r1.append(r15)     // Catch:{ all -> 0x0126 }
            java.lang.String r15 = r1.toString()     // Catch:{ all -> 0x0126 }
            org.webrtc.Logging.m25024e(r2, r15, r0)     // Catch:{ all -> 0x0126 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0126 }
            r15.<init>()     // Catch:{ all -> 0x0126 }
            if (r3 == 0) goto L_0x0125
            java.lang.String r4 = "org/webrtc/Camera1Enumerator"
            java.lang.String r5 = "enumerateFormats"
            java.lang.String r6 = "(I)Ljava/util/List;"
            java.lang.String r7 = "android/hardware/Camera"
            java.lang.String r8 = "release"
            java.lang.String r9 = "()V"
            j20.C117292a.m165363i(r3, r4, r5, r6, r7, r8, r9)
        L_0x0125:
            return r15
        L_0x0126:
            r15 = move-exception
            r0 = r3
        L_0x0128:
            if (r0 == 0) goto L_0x013b
            java.lang.String r1 = "org/webrtc/Camera1Enumerator"
            java.lang.String r2 = "enumerateFormats"
            java.lang.String r3 = "(I)Ljava/util/List;"
            java.lang.String r4 = "android/hardware/Camera"
            java.lang.String r5 = "release"
            java.lang.String r6 = "()V"
            j20.C117292a.m165363i(r0, r1, r2, r3, r4, r5, r6)
        L_0x013b:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Camera1Enumerator.enumerateFormats(int):java.util.List");
    }

    public static int getCameraIndex(String str) {
        Logging.m25022d(TAG, "getCameraIndex: " + str);
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            if (str.equals(getDeviceName(i))) {
                return i;
            }
        }
        throw new IllegalArgumentException("No such camera: " + str);
    }

    private static Camera.CameraInfo getCameraInfo(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i, cameraInfo);
            return cameraInfo;
        } catch (Exception e) {
            Logging.m25024e(TAG, "getCameraInfo failed on index " + i, e);
            return null;
        }
    }

    public static String getDeviceName(int i) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i);
        if (cameraInfo == null) {
            return null;
        }
        String str = cameraInfo.facing == 1 ? "front" : "back";
        return "Camera " + i + ", Facing " + str + ", Orientation " + cameraInfo.orientation;
    }

    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture);
    }

    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
            String deviceName = getDeviceName(i);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.m25022d(TAG, "Index: " + i + ". " + deviceName);
            } else {
                Logging.m25023e(TAG, "Index: " + i + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z) {
        this.captureToTexture = z;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i) {
        List<CameraEnumerationAndroid.CaptureFormat> list;
        synchronized (Camera1Enumerator.class) {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i2 = 0; i2 < Camera.getNumberOfCameras(); i2++) {
                    cachedSupportedFormats.add(enumerateFormats(i2));
                }
            }
            list = cachedSupportedFormats.get(i);
        }
        return list;
    }
}
