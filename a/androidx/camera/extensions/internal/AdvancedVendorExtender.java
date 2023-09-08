package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.advanced.AdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.AutoAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BeautyAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.BokehAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.HdrAdvancedExtenderImpl;
import androidx.camera.extensions.impl.advanced.NightAdvancedExtenderImpl;
import androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator;
import androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p329d3.C20434g;

public class AdvancedVendorExtender implements VendorExtender {
    private final AdvancedExtenderImpl mAdvancedExtenderImpl;
    private String mCameraId;
    private final ExtensionDisabledValidator mExtensionDisabledValidator = new ExtensionDisabledValidator();
    private final int mMode;

    public AdvancedVendorExtender(int i) {
        this.mMode = i;
        if (i == 1) {
            this.mAdvancedExtenderImpl = new BokehAdvancedExtenderImpl();
        } else if (i == 2) {
            this.mAdvancedExtenderImpl = new HdrAdvancedExtenderImpl();
        } else if (i == 3) {
            this.mAdvancedExtenderImpl = new NightAdvancedExtenderImpl();
        } else if (i == 4) {
            this.mAdvancedExtenderImpl = new BeautyAdvancedExtenderImpl();
        } else if (i == 5) {
            try {
                this.mAdvancedExtenderImpl = new AutoAdvancedExtenderImpl();
            } catch (NoClassDefFoundError unused) {
                throw new IllegalArgumentException("AdvancedExtenderImpl does not exist");
            }
        } else {
            throw new IllegalArgumentException("Should not active ExtensionMode.NONE");
        }
    }

    private List<Pair<Integer, Size[]>> convertResolutionMapToList(Map<Integer, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        for (Integer next : map.keySet()) {
            arrayList.add(new Pair(next, (Size[]) map.get(next).toArray(new Size[0])));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public SessionProcessor createSessionProcessor(Context context) {
        C20434g.m22020d(this.mCameraId, "VendorExtender#init() must be called first");
        return new AdvancedSessionProcessor(this.mAdvancedExtenderImpl.createSessionProcessor(), context);
    }

    public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
        C20434g.m22020d(this.mCameraId, "VendorExtender#init() must be called first");
        return this.mAdvancedExtenderImpl.getEstimatedCaptureLatencyRange(this.mCameraId, size, 256);
    }

    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        C20434g.m22020d(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedCaptureOutputResolutions(this.mCameraId));
    }

    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        C20434g.m22020d(this.mCameraId, "VendorExtender#init() must be called first");
        return convertResolutionMapToList(this.mAdvancedExtenderImpl.getSupportedPreviewOutputResolutions(this.mCameraId));
    }

    public Size[] getSupportedYuvAnalysisResolutions() {
        C20434g.m22020d(this.mCameraId, "VendorExtender#init() must be called first");
        List supportedYuvAnalysisResolutions = this.mAdvancedExtenderImpl.getSupportedYuvAnalysisResolutions(this.mCameraId);
        return supportedYuvAnalysisResolutions == null ? new Size[0] : (Size[]) supportedYuvAnalysisResolutions.toArray(new Size[0]);
    }

    public void init(CameraInfo cameraInfo) {
        this.mCameraId = Camera2CameraInfo.from(cameraInfo).getCameraId();
        this.mAdvancedExtenderImpl.init(this.mCameraId, Camera2CameraInfo.from(cameraInfo).getCameraCharacteristicsMap());
    }

    public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
        if (this.mExtensionDisabledValidator.shouldDisableExtension(str, this.mMode)) {
            return false;
        }
        return this.mAdvancedExtenderImpl.isExtensionAvailable(str, map);
    }
}
