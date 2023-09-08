package com.tencent.gpudetector;

import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import java.util.HashMap;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13604l;
import sx3.C90364q0;

@Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/gpudetector/JniGPUDetector;", "", "()V", "gpuArchInfo", "", "getGpuArchInfo", "()Ljava/lang/String;", "gpuCodeInfo", "", "getGpuCodeInfo", "()I", "gpuCoreSumInfo", "getGpuCoreSumInfo", "gpuInfo", "", "getGpuInfo", "()[I", "gpuPerfScoreInfo", "getGpuPerfScoreInfo", "GetGPUDeviceModel", "", "deviceModel", "Lcom/tencent/gpudetector/JniGPUDetector$GpuDeviceModel;", "Companion", "GpuDeviceModel", "gpudetector_release"}, mo182095k = 1, mo182096mv = {1, 1, 16})
public final class JniGPUDetector {
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public static final HashMap<Integer, String> gpuDetailList = C90364q0.m113146e(new C13604l(-1, "GpuDeviceArchUnknown"), new C13604l(0, "GpuDeviceArchAMDGeneric"), new C13604l(1, "GpuDeviceArchAppleGeneric"), new C13604l(2, "GpuDeviceArchAppleA"), new C13604l(3, "GpuDeviceArchARMGeneric"), new C13604l(4, "GpuDeviceArchMaliMidgardT"), new C13604l(5, "GpuDeviceArchMaliBifrostG"), new C13604l(6, "GpuDeviceArchMaliValhallG"), new C13604l(7, "GpuDeviceArchImaginationGeneric"), new C13604l(8, "GpuDeviceArchPowerVRSGX"), new C13604l(9, "GpuDeviceArchPowerVRRogueGeneric"), new C13604l(10, "GpuDeviceArchPowerVRRogueG"), new C13604l(11, "GpuDeviceArchPowerVRRogueGX"), new C13604l(12, "GpuDeviceArchPowerVRRogueGT"), new C13604l(13, "GpuDeviceArchPowerVRRogueGE"), new C13604l(14, "GpuDeviceArchPowerVRRogueGM"), new C13604l(15, "GpuDeviceArchPowerVRFurianBegin"), new C13604l(16, "GpuDeviceArchPowerVRFurianGT"), new C13604l(17, "GpuDeviceArchImgAlbiorixGeneric"), new C13604l(18, "GpuDeviceArchImgAlbiorixAXE"), new C13604l(19, "GpuDeviceArchImgAlbiorixAXM"), new C13604l(20, "GpuDeviceArchImgAlbiorixAXT"), new C13604l(21, "GpuDeviceArchImgBSericesGeneric"), new C13604l(22, "GpuDeviceArchImgBSericesBX"), new C13604l(23, "GpuDeviceArchImgBSericesBXS"), new C13604l(24, "GpuDeviceArchImgBSericesBXM"), new C13604l(25, "GpuDeviceArchImgBSericesBXE"), new C13604l(26, "GpuDeviceArchImgBSericesBXT"), new C13604l(27, "GpuDeviceArchIntelGeneric"), new C13604l(28, "GpuDeviceArchNVIDIAGeneric"), new C13604l(29, "GpuDeviceArchQualcommGeneric"), new C13604l(30, "GpuDeviceArchAdreno3XX"), new C13604l(31, "GpuDeviceArchAdreno4XX"), new C13604l(32, "GpuDeviceArchAdreno5XX"), new C13604l(33, "GpuDeviceArchAdreno6XX"));
    private byte _hellAccFlag_;

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/gpudetector/JniGPUDetector$Companion;", "", "()V", "gpuDetailList", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getGpuDetailList", "()Ljava/util/HashMap;", "getArchNameDetail", "arch", "getVersion", "showGpuDeviceModel", "gpudetector_release"}, mo182095k = 1, mo182096mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }

        public final String getArchNameDetail(int i) {
            return i + '(' + getGpuDetailList().get(Integer.valueOf(i)) + ')';
        }

        public final HashMap<Integer, String> getGpuDetailList() {
            return JniGPUDetector.gpuDetailList;
        }

        public final String getVersion() {
            return "1.0.0-30";
        }

        public final String showGpuDeviceModel() {
            GpuDeviceModel gpuDeviceModel = new GpuDeviceModel();
            if (!new JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
                return "Failed to detect GPU";
            }
            String format = String.format("GPU arch: %s\n, code: %d, numCores: %d, perfScore: %d\nvendor: %s\nname: %s\nversion: %s\n", Arrays.copyOf(new Object[]{getArchNameDetail(gpuDeviceModel.getArch()), Integer.valueOf(gpuDeviceModel.getCode()), Integer.valueOf(gpuDeviceModel.getNumCores()), Integer.valueOf(gpuDeviceModel.getPerfScore()), gpuDeviceModel.getVendor(), gpuDeviceModel.getName(), gpuDeviceModel.getVersion()}, 7));
            C87412m.m108590c(format, "java.lang.String.format(format, *args)");
            return format;
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/gpudetector/JniGPUDetector$GpuDeviceModel;", "", "()V", "arch", "", "getArch", "()I", "setArch", "(I)V", "code", "getCode", "setCode", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "numCores", "getNumCores", "setNumCores", "perfScore", "getPerfScore", "setPerfScore", "vendor", "getVendor", "setVendor", "version", "getVersion", "setVersion", "gpudetector_release"}, mo182095k = 1, mo182096mv = {1, 1, 16})
    public static final class GpuDeviceModel {
        private int arch;
        private int code;
        private String name = "Unknown";
        private int numCores;
        private int perfScore;
        private String vendor = "Unknown";
        private String version = "Unknown";

        public final int getArch() {
            return this.arch;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getName() {
            return this.name;
        }

        public final int getNumCores() {
            return this.numCores;
        }

        public final int getPerfScore() {
            return this.perfScore;
        }

        public final String getVendor() {
            return this.vendor;
        }

        public final String getVersion() {
            return this.version;
        }

        public final void setArch(int i) {
            this.arch = i;
        }

        public final void setCode(int i) {
            this.code = i;
        }

        public final void setName(String str) {
            C87412m.m108595h(str, "<set-?>");
            this.name = str;
        }

        public final void setNumCores(int i) {
            this.numCores = i;
        }

        public final void setPerfScore(int i) {
            this.perfScore = i;
        }

        public final void setVendor(String str) {
            C87412m.m108595h(str, "<set-?>");
            this.vendor = str;
        }

        public final void setVersion(String str) {
            C87412m.m108595h(str, "<set-?>");
            this.version = str;
        }
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("GPUDetector");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/gpudetector/JniGPUDetector", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/gpudetector/JniGPUDetector", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public final native boolean GetGPUDeviceModel(GpuDeviceModel gpuDeviceModel);

    public final String getGpuArchInfo() {
        GpuDeviceModel gpuDeviceModel = new GpuDeviceModel();
        return new JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel) ? Companion.getArchNameDetail(gpuDeviceModel.getArch()) : Companion.getArchNameDetail(-1);
    }

    public final int getGpuCodeInfo() {
        GpuDeviceModel gpuDeviceModel = new GpuDeviceModel();
        if (new JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return gpuDeviceModel.getCode();
        }
        return -1;
    }

    public final int getGpuCoreSumInfo() {
        GpuDeviceModel gpuDeviceModel = new GpuDeviceModel();
        if (new JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return gpuDeviceModel.getNumCores();
        }
        return -1;
    }

    public final int[] getGpuInfo() {
        GpuDeviceModel gpuDeviceModel = new GpuDeviceModel();
        if (!new JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return null;
        }
        gpuDeviceModel.getArch();
        gpuDeviceModel.getCode();
        gpuDeviceModel.getNumCores();
        return null;
    }

    public final int getGpuPerfScoreInfo() {
        GpuDeviceModel gpuDeviceModel = new GpuDeviceModel();
        if (new JniGPUDetector().GetGPUDeviceModel(gpuDeviceModel)) {
            return gpuDeviceModel.getPerfScore();
        }
        return -1;
    }
}
