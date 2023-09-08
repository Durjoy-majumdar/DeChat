package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ExposureState;

class ExposureStateImpl implements ExposureState {
    private final CameraCharacteristicsCompat mCameraCharacteristics;
    private int mExposureCompensation;
    private final Object mLock = new Object();

    public ExposureStateImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mExposureCompensation = i;
    }

    public int getExposureCompensationIndex() {
        int i;
        synchronized (this.mLock) {
            i = this.mExposureCompensation;
        }
        return i;
    }

    public Range<Integer> getExposureCompensationRange() {
        return (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    public Rational getExposureCompensationStep() {
        return !isExposureCompensationSupported() ? Rational.ZERO : (Rational) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.mCameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((Integer) range.getLower()).intValue() == 0 || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    public void setExposureCompensationIndex(int i) {
        synchronized (this.mLock) {
            this.mExposureCompensation = i;
        }
    }
}
